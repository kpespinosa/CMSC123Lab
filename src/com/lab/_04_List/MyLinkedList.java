/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._04_List;

import java.util.Iterator;

/**
 *
 * @author KurtJunsheanEspinosa
 */

public class MyLinkedList<E> implements MyList<E> {

    private int theSize;
    private int modCount = 0;
    private Node<E> beginMarker;
    private Node<E> endMarker;

    public MyLinkedList() {
        doClear();
    }

    public void clear() {
        doClear();
    }

    private void doClear() {
        beginMarker = new Node<E>(null, null, null);
        endMarker = new Node<E>(null, beginMarker, null);
        beginMarker.next = endMarker;
        theSize = 0;
        modCount++;
    }

    @Override
    public void add(E item) {
        add(size(), item);
    }

    @Override
    public void add(int pos, E item) {
        addBefore(getNode(pos, 0, size()), item);
    }

    @Override
    public boolean contains(E item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int size() {
        return theSize;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public E get(int pos) {
        return getNode(pos).data;
    }

    @Override
    public E remove(int pos) {
        return remove(getNode(pos));
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    public void removeAll(Iterable<? extends E> items) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void addFirst(E e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void addLast(E e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E removeFirst() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E removeLast() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E getFirst() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E getLast() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static class Node<E> {

        public E data;
        public Node<E> prev;
        public Node<E> next;

        public Node(E d, Node<E> p, Node<E> n) {
            data = d;
            prev = p;
            next = n;
        }
    }

    private void addBefore(Node<E> p, E x) {
        Node<E> newNode = new Node<E>(x, p.prev, p);
        newNode.prev.next = newNode;
        p.prev = newNode;
        theSize++;
        modCount++;
    }

    private Node<E> getNode(int idx) {
        return getNode(idx, 0, size() - 1);
    }

    private Node<E> getNode(int idx, int lower, int upper) {
        Node<E> p;
        if (idx < lower || idx > upper) {
            throw new IndexOutOfBoundsException();
        }
        if (idx < size() / 2) {
            p = beginMarker.next;
            for (int i = 0; i < idx; i++) {
                p = p.next;
            }
        } else {
            p = endMarker;
            for (int i = size(); i > idx; i--) {
                p = p.prev;
            }
        }
        return p;
    }

    private E remove(Node<E> p) {
        p.next.prev = p.prev;
        p.prev.next = p.next;
        theSize--;
        modCount++;
        return p.data;
    }

    private class LinkedListIterator implements java.util.Iterator<E> {

        private Node<E> current = beginMarker.next;
        private int expectedModCount = modCount;
        private boolean okToRemove = false;

        @Override
        public boolean hasNext() {
            return current != endMarker;
        }

        @Override
        public E next() {
            if (modCount != expectedModCount) {
                throw new java.util.ConcurrentModificationException();
            }
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            E nextItem = current.data;
            current = current.next;
            okToRemove = true;
            return nextItem;
        }

        @Override
        public void remove() {
            if (modCount != expectedModCount) {
                throw new java.util.ConcurrentModificationException();
            }
            if (!okToRemove) {
                throw new IllegalStateException();
            }
            MyLinkedList.this.remove(current.prev);
            expectedModCount++;
            okToRemove = false;
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._05_StacksQueue;

/**
 *
 * @author KurtJunsheanEspinosa
 */
/*
public class LinkedListStack<AnyType> implements Stack<AnyType> {

    @Override
    public void push(AnyType e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public AnyType pop() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public AnyType top() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void empty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}

*/

public class LinkedListStack<AnyType> implements Stack<AnyType> {

    private Node<AnyType> startMarker;
    private int size;
    
    
    
    LinkedListStack(){
        clearAll();
    }
    
    public void clearAll(){
        startMarker = new Node<AnyType>(null, null);
        size = 0;
    }
    
    
    
    private class Node<AnyType>{
        public AnyType data;
        public Node<AnyType> next;
        
        Node(AnyType d, Node<AnyType> n){
            data = d;
            next = n;
        }
        
    }

    
    @Override
    public void push(AnyType e) {
        // TODO Auto-generated method stub
        Node<AnyType> insert = new Node<AnyType>(e, startMarker.next);
        startMarker.next = insert;
        size++;
    }

    @Override
    public AnyType pop() {
        // TODO Auto-generated method stub
        if (size()==0)
            return null;
        else{
            Node<AnyType> del = startMarker.next;
            startMarker.next = del.next;
            size--;
            del.next = null;
            return del.data;
        }
    }

    @Override
    public AnyType top() {
        // TODO Auto-generated method stub
        if(size()==0)
            return null;
        else
            return startMarker.next.data;
    }

    @Override
    public void empty() {
        // TODO Auto-generated method stub
        clearAll();
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return size==0;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return size;
    }
    
    
}
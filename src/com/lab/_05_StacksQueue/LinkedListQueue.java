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
public class LinkedListQueue<AnyType> implements Queue<AnyType> {

    @Override
    public void enqueue(AnyType e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public AnyType dequeue() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public AnyType peek() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void empty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
*/


public class LinkedListQueue<AnyType> implements Queue<AnyType>{
    
    Node<AnyType> startMarker;
    Node<AnyType> endMarker;
    int size = 0;
    
    LinkedListQueue(){
        clearAll();
    }
    
    
    public void clearAll(){
        startMarker = new Node<AnyType>( null, null, null );
        endMarker = new Node<AnyType>(startMarker, null, null );
        startMarker.next = endMarker;
        size = 0;
    }
    
    
    
    
    public class Node<AnyType>{
        AnyType data;
        Node<AnyType> previous;
        Node<AnyType> next;
        
        Node(Node<AnyType> p, AnyType d, Node<AnyType> n){
            previous = p;
            data = d;
            next = n;
        }
        
    }
    
    @Override
    public void enqueue(AnyType e) {
        // TODO Auto-generated method stub
        Node<AnyType> insert = new Node<AnyType>(endMarker.previous, e, endMarker);
        endMarker.previous.next = insert;
        endMarker.previous = insert;
        size++;
    }

    @Override
    public AnyType dequeue() {
        // TODO Auto-generated method stub
        if (size()==0)
            return null;
        else{
            Node<AnyType> del = startMarker.next;
            startMarker.next = del.next;
            del.next.previous = startMarker;
            size--;
            del.previous = del.next = null;
            return del.data;
        }
    }

    @Override
    public AnyType peek() {
        // TODO Auto-generated method stub
        if(size()==0)
            return null;
        else
            return startMarker.next.data;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return size;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void empty() {
        // TODO Auto-generated method stub
        clearAll();
    }
    

}
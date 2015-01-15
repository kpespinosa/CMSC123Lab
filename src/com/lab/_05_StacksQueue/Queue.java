/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._05_StacksQueue;

/**
 *
 * @author KurtJunsheanEspinosa
 */
public interface Queue<AnyType> {
    void enqueue(AnyType e);
    AnyType dequeue();
    AnyType peek();
    
    int size();
    boolean isEmpty();
    void empty();
}

class QueueEmptyException extends RuntimeException{
    
}

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
 public class ArrayStack<AnyType> implements Stack<AnyType>{
    private AnyType [] ar;
    private int top;
    private int size;
    
    ArrayStack(){
        clear();
    }
 
    private void clear(){
        ar = (AnyType []) new Object[10];
        top = -1;
        size = 0;
    }
    @Override
    public void push(AnyType e) {
//        ar[++top] = e;
//        size++;
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public AnyType pop() {
        if(size()==0)
            throw new StackEmptyException("Stack is empty.");
        size--;
        AnyType e = ar[top--];
        return e;
    }

    @Override
    public AnyType top() {
        return ar[top];
    }

    @Override
    public void empty() {
        clear();
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }
   
}

*/


public class ArrayStack<AnyType> implements Stack<AnyType>{

    private AnyType [] ar;
    private int top;
    private int cursize;
    private int size;
    private final int max_default = 10;
    
    ArrayStack(){
        clear();
    }
    
    
    private void clear(){
        ar = extracted();
        top = -1;
        size = 0;
        cursize = 10;
    }



    
    private AnyType[] extracted() {
        return (AnyType []) new Object[max_default];
    }
    
    @Override
    public void push(AnyType e) {
        if (size == cursize)
            extend();
        ar[++top] = e;
        size++;
    }

    public void extend(){
        AnyType[] temp = ar;
        
        cursize+=20;
        ar = extracted();
        
        for(int i = 0; i < temp.length; i++){
            ar[i] = temp[i];
        }

    }
    
    
    @Override
    public AnyType pop() {
        if(size()==0)
            throw new StackEmptyException("Stack is empty.");
        size--;
        AnyType e = ar[top--];
        return e;
    }


    @Override
    public AnyType top() {
        if (isEmpty())
            return null;
        return ar[top];
    }


    @Override
    public void empty() {
        clear();
    }


    @Override
    public boolean isEmpty() {
        return size==0;
    }


    @Override
    public int size() {
        return size;
    }
   
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._05_StacksQueue;

import java.util.Scanner;

/**
 *
 * @author KurtJunsheanEspinosa
 */
/*
public class ArrayQueue<AnyType> implements Queue<AnyType> {

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


public class ArrayQueue<AnyType> implements Queue<AnyType>{
    private AnyType[] ar;
    private final int max_default = 10;
    private int start;
    private int end;
    private int size;
    private int cursize;
    
    ArrayQueue(){
        clearAll();
    }
    
    
    public void clearAll(){
        ar = (AnyType[]) new Object[max_default];
        start = -1;
        end = -1;
        size = 10;
        cursize = 0;
    }
    
    @Override
    public void enqueue(AnyType e) {
        // TODO Auto-generated method stub
        if (start == -1 && end == -1){
            end++;
            ar[end] = e;
            start++;
        }
        else{
            if (end==size-1){
                if (start == 0){
                    extend();
                }
                else
                    end = -1;
//              System.out.println(end + "" "" + size);
            }
            end++;
            ar[end] = e;
        }
        cursize++;
    }

    public void extend(){
        AnyType[] temp = ar;
        
        size+=20;
        ar = extracted();
        
        if (end < start){
            int s = start;
            int i;
            for(i = 0; s<size ; i++, s++){
                temp[i] = ar[s];
            }
            s = end;
            for(; s < start; i++, s++){
                temp[i] = ar[s];
            }
        start = 0;
        end = cursize;
        }
        
        else{
            for(int i = 0; i < temp.length; i++){
                ar[i] = temp[i];
            }
        }

    }

    
    private AnyType[] extracted() {
        return (AnyType[]) new Object[size];
    }
    
    @Override
    public AnyType dequeue() {
        // TODO Auto-generated method stub
        AnyType temp = ar[start];
        ar[start++] = null;
        cursize--;
        return temp;
    }

    @Override
    public AnyType peek() {
        // TODO Auto-generated method stub
        if (isEmpty())
            return null;
        return ar[start];
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return cursize;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return cursize==0;
    }

    @Override
    public void empty() {
        // TODO Auto-generated method stub
        for(int i = 0; i < size; i++){
            ar[i] = null;
        }
        cursize=0;
    }

}
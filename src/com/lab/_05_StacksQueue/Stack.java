/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._05_StacksQueue;

/**
 *
 * @author KurtJunsheanEspinosa
 */
public interface Stack<AnyType>{
	void push(AnyType e);
	AnyType pop();
	AnyType top();
	void empty();
	boolean isEmpty();
	int size();
}
class StackEmptyException extends RuntimeException{
    StackEmptyException(String msg){
        System.out.println(msg);
    }
}
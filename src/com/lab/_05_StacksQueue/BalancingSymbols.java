/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._05_StacksQueue;

import java.util.HashMap;

/**
 *
 * @author KurtJunsheanEspinosa
 */
/*
public class BalancingSymbols {

    public static void main(String[] args) {
        //read a file here into a string
        //call isBalanced
    }


    public boolean isBalanced(String input) {
        //code here
        return false;
    }
}
*/
public class BalancingSymbols {
    public boolean isBalanced(String input){
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if (c == '{' || c == '(' || c == '<'){
                push(c);
            }
            else if (c == '}' || c == ')' || c == '>'){
                if(isEmpty()){
                    flag = true;
                    return false;
                }
                else{
                    if(check(c)){
                        pop();
                    }
                    else{
                        flag = true;
                        return false;
                    }
                }
            }
                
        }   
        return true;
    }
    
    public boolean check(char c){
        if (top() == '{' && c == '}')
            return true;
        if (top() == '(' && c == ')')
            return true;
        if (top() == '<' && c == '>')
            return true;
        return false;
    }
    
    public void push(char e) {
        // TODO Auto-generated method stub
        Node insert = new Node(e, startMarker.next);
        startMarker.next = insert;
        size++;
        System.out.println(insert.data);
    }

    public char pop() {
        // TODO Auto-generated method stub
        if (size()==0)
            return 0;
        else{
            Node del = startMarker.next;
            startMarker.next = del.next;
            size--;
            del.next = null;
            return del.data;
        }
    }

    public char top() {
        // TODO Auto-generated method stub
        if(size()==0)
            return 0;
        else
            return startMarker.next.data;
    }


    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return size==0;
    }

    public int size() {
        // TODO Auto-generated method stub
        return size;
    }
    
    Node startMarker;
    int size;
    boolean flag;
    
    private class Node{
        public char data;
        public Node next;
        
        Node(char d, Node n){
            data = d;
            next = n;
        }
        
        
    }

}

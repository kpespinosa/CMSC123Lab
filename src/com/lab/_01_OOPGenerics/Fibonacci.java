/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._01_OOPGenerics;

/**
 *
 * @author KurtJunsheanEspinosa
 */
public class Fibonacci {
    
    public static void main(String[] args){
        System.out.println("");
        System.out.println(dynamic(6));
        
    }
    
    int iterative(int n){
        
        return 1;
    }
    
    int rec(int n){
        return 1;
    }
    
    static int dynamic(int n){
        int[] FibArray = new int[n];
        FibArray[0] = 0;
        for (int i=0; i<n; i++){
            if (i==0||i==1)
                FibArray[i] = 1;
            else
                FibArray[i] = FibArray[i-1] + FibArray[i-2];
            
            System.out.print(FibArray[i] + " ");
            
        }
        return FibArray[n-1];
    }
            
    
}

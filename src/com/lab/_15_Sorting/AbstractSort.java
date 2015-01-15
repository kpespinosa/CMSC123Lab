/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._15_Sorting;

/**
 *
 * @author KurtJunsheanEspinosa
 */
public abstract class AbstractSort implements Sort{

    public void print(int[] a){
        String s = "";
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
}

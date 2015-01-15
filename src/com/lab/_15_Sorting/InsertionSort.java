/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._15_Sorting;

/**
 *
 * @author KurtJunsheanEspinosa
 */
public class InsertionSort extends AbstractSort{

    @Override
    public void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int index = a[i];
            int j = i;
            while(j>0 && a[j-1] > index){
                a[j] = a[j-1];
                j--;
            }
            a[j] = index;
        }
    }   
}

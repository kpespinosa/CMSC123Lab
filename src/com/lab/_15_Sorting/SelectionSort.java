/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._15_Sorting;

/**
 *
 * @author KurtJunsheanEspinosa
 */
public class SelectionSort extends AbstractSort{

    @Override
    public void sort(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                if(a[j] < a[min])
                    min = j;
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }
}

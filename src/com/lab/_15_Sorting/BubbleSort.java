/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._15_Sorting;

/**
 *
 * @author KurtJunsheanEspinosa
 */
public class BubbleSort extends  AbstractSort{

    @Override
    public void sort(int[] a) {
        for (int i = a.length-1; i >=0; i--) {
            for (int j = 1; j <=i; j++) {
                if(a[j-1] > a[j]){
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
            
        }
    }
}

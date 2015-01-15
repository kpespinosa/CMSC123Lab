/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._15_Sorting;

/**
 *
 * @author KurtJunsheanEspinosa
 */
public class QuickSort extends AbstractSort{

    @Override
    public void sort(int[] a) {
        sort(a, 0, a.length-1);
    }
    private void sort(int[] a, int start, int end){
        if(start < end){
            int index = partition(a, start, end);
            sort(a, start, index-1);
            sort(a, index+1, end);
        }
    }
    private int partition(int[] a, int start, int end){
        int pivot = a[end];
        int pIndex = start;
        for (int i = start; i <end; i++) {
            if(a[i] <= pivot){
                swap(a, i, pIndex);
                pIndex++;
            }
        }
        swap(a, end, pIndex);
        return pIndex;
    }
    private void swap(int[] a, int b, int c){
        int temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }
}

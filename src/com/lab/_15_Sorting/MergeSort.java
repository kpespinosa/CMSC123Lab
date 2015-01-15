/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._15_Sorting;

/**
 *
 * @author KurtJunsheanEspinosa
 */
public class MergeSort extends AbstractSort{

    @Override
    public void sort(int[] a) {
        int n = a.length;
        if(n < 2)
            return;
        int mid = n/2;
        if(n%2!=0)
           mid = (n-1)/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];
        for (int i = 0; i <=mid-1; i++) {
            left[i] = a[i];
        }
        for (int i = mid; i <=n-1; i++) {
            right[i-mid] = a[i];
        }
        sort(left);
        sort(right);
        merge(left, right, a);
    }
    private void merge(int[] left, int[] right, int[] a){
        int leftLen = left.length;
        int rightLen = right.length;
        int aInd=0,leftInd=0,rightInd=0;
        while(leftInd < leftLen && rightInd < rightLen){
            if(left[leftInd] <= right[rightInd]){
                a[aInd] = left[leftInd];
                leftInd++;
            }else{
                a[aInd] = right[rightInd];
                rightInd++;
            }
            aInd++;
        }
        while(leftInd < leftLen){
            a[aInd] = left[leftInd];
            leftInd++;
            aInd++;
        }
        while(rightInd < rightLen){
            a[aInd] = right[rightInd];
            rightInd++;
            aInd++;
        }
        
    }
}

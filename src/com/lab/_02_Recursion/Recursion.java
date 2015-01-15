/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._02_Recursion;

/**
 *
 * @author 2013-40347
 */
public class Recursion {
    
    public boolean recBinSearch(int[] sorted, int start, int end, int key) {
        if (start < end) {
            int mid = start + (end - start) / 2;  // Compute mid point.
            if (key < sorted[mid]) {
                return recBinSearch(sorted, start, mid, key);

            } else if (key > sorted[mid]) {
                return recBinSearch(sorted, mid + 1, end, key);
            } else {
                return true;   // Found it.
            }
        }
        return false;  // Failed to find key
    }

    public int recfib(int n) {
        if (n <= 1) 
            return n;
        else 
            return recfib(n-1) + recfib(n-2);
    }

    public int dynamicFib(int n) {
        int[] fib = new int[n+1];

        // base cases
        if(n>=0)
            fib[0] = 0;
        if(n>=1)
            fib[1] = 1;
        if(n>1)
            for (int i = 2; i <=n; i++)
                fib[i] = fib[i-1] + fib[i-2];
        // bottom-up dynamic programming
        return fib[n];
    }

    public int recFindMax(int[] A, int startIndex) {
        //Supply the missing code
        if (startIndex == 0) {
            return A[0];
        } else {
            return Math.max(A[startIndex], recFindMax(A, startIndex-1));
        }

    }

    public int binarySum(int[] a, int i, int n) {
         if(n == 1 )
            return a[i];
         else
         {
             if(n%2==0)
                return binarySum(a,i,n/2) + binarySum(a,i+(n/2),n/2);
             else
                return binarySum(a,i,(n+1)/2) + binarySum(a,i+((n+1)/2),((n-1)/2));
         }
            
    }
}
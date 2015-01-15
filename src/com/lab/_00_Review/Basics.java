package com.lab._00_Review;

/**
 *
 * 
 */
public class Basics {

    public int factorial(int n) {
        int prod = 1;
        if (n == 0) {
            return 1;
        } else {
            while (n > 0) {
                prod = prod * n;
                n--;
            }
        }
        return prod;
    }

    public int sum(int[] a, int n) {
        int i, sum = 0;
        for (i = 0; i < n; i++) {
            sum = sum + a[i];
        }

        return sum;
    }

    public void reverseArray(int[] a, int i, int j) {
        int hold, tail = j;
        for (i = 0; i < (j / 2); i++) {
            hold = a[i];
            a[i] = a[tail];
            a[tail] = hold;
            tail--;
        }
    }

    public int fib(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            int fibo = 2, j = 1, i;
            for (i = 2; i <= n; i++) {
                fibo = fibo + (j - 1);
                j++;
            }

            return fibo;
        }
    }

    public boolean isPalindrome(String str) {
        String reverse_str = "";
        str = str.toLowerCase();
        str = str.replaceAll("\\W", "");
        int len_str = str.length();
        for(int i = len_str-1; i >= 0; i--)
            reverse_str = reverse_str + str.charAt(i);
        if(str.equals(reverse_str))
           return true;
        else
           return false;
    }
}

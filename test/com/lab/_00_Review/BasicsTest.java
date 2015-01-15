/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._00_Review;



import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author KurtJunsheanEspinosa
 */
public class BasicsTest {
    

    /**
     * Test of factorial method, of class Basics.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        Basics b = new Basics();
        assertEquals(1, b.factorial(0));
        assertEquals(24, b.factorial(4));
    }

    /**
     * Test of sum method, of class Basics.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        Basics b = new Basics();
        int[] a = {1,2,3,4,5};
        assertEquals(15, b.sum(a, 5));
        assertEquals(1, b.sum(a, 1));
    }

    /**
     * Test of reverseArray method, of class Basics.
     */
    @Test
    public void testReverseArray() {
        System.out.println("reverseArray");
        Basics Basics = new Basics();
        int[] a = {1,2,3,4,5};
        int[] b = {5,4,3,2,1};
        Basics.reverseArray(a, 0, 4);
        assertArrayEquals(b, a);
    }

    /**
     * Test of fib method, of class Basics.
     */
    @Test
    public void testFib() {
        System.out.println("fib");
        Basics b = new Basics();
        assertEquals(1, b.fib(0));
        assertEquals(1, b.fib(1));
        assertEquals(2, b.fib(2));
        assertEquals(3, b.fib(3));
        assertEquals(5, b.fib(4));
    }

    /**
     * Test of isPalindrome method, of class Basics.
     */
    @Test
    public void testIsPalindrome() {
        System.out.println("isPalindrome");
        Basics b = new Basics();
        assertEquals(true, b.isPalindrome("racecar"));
        assertEquals(true, b.isPalindrome("Race fast, safe car!"));
        assertEquals(true, b.isPalindrome("Madame, not one man is selfless; I name not one, madam."));
        assertEquals(true, b.isPalindrome("Tuna roll or a nut?"));
        assertEquals(true, b.isPalindrome("Ya! Pizza zip pizazz! I pay."));
    }
}

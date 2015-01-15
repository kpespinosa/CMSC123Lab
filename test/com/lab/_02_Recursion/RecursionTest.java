/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._02_Recursion;

import com.lab._00_Review.Basics;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author KurtJunsheanEspinosa
 */
public class RecursionTest {
    
    

    /**
     * Test of recBinSearch method, of class Recursion.
     */
    @Test
    public void testRecBinSearch() {
        System.out.println("recBinSearch");
        Recursion b = new Recursion();
        int[] a = {1,2,3,4,5,6};
        assertEquals(true, b.recBinSearch(a, 0, 5, 5));
        assertEquals(false, b.recBinSearch(a, 0, 5, 7));
    }

    /**
     * Test of recfib method, of class Recursion.
     */
    @Test
    public void testRecfib() {
        Recursion b = new Recursion();
        System.out.println("recfib");
        assertEquals(0, b.recfib(0));
        assertEquals(1, b.recfib(1));
        assertEquals(1, b.recfib(2));
        assertEquals(2, b.recfib(3));
        assertEquals(3, b.recfib(4));
    }

    /**
     * Test of dynamicFib method, of class Recursion.
     */
    @Test
    public void testDynamicFib() {
        Recursion b = new Recursion();
        System.out.println("dynamicfib");
        assertEquals(0, b.dynamicFib(0));
        assertEquals(1, b.dynamicFib(1));
        assertEquals(1, b.dynamicFib(2));
        assertEquals(2, b.dynamicFib(3));
        assertEquals(3, b.dynamicFib(4));
    }

    /**
     * Test of recFindMax method, of class Recursion.
     */
    @Test
    public void testRecFindMax() {
        System.out.println("recFindMax");
        Recursion instance = new Recursion();
        int[] a = {1, 2,3,4,5};
        assertEquals(1, instance.recFindMax(a,0));
        int[] b = {5, 2,3,4,6};
        assertEquals(5, instance.recFindMax(b,2));
        int[] c = {5,5,5,5};
        assertEquals(5, instance.recFindMax(c,3));
        int[] d = {5,4,3,2,1};
        assertEquals(5, instance.recFindMax(d,4));
    }

    /**
     * Test of binarySum method, of class Recursion.
     */
    @Test
    public void testBinarySum() {
        System.out.println("binarySum");
        int[] a = {1,2,3,4,5};
        Recursion instance = new Recursion();
        assertEquals(15, instance.binarySum(a,0,5));
        assertEquals(1, instance.binarySum(a,0,1));
        assertEquals(5, instance.binarySum(a,4,1));
        assertEquals(9, instance.binarySum(a,1,3));
    }
}

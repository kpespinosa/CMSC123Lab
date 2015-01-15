/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._13_Sorting;


import com.lab._15_Sorting.InsertionSort;
import com.lab._15_Sorting.Sort;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author KurtJunsheanEspinosa
 */
public class InsertionSortTest {
    
    public InsertionSortTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of sort method, of class InsertionSort.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
         Sort s = new InsertionSort();
         int[] a = {7,5,2,4,3,9};
         int[] b = {2,3,4,5,7,9};
         int[] c = {9,7,5,4,3,2};
         int[] x = {2,3,4,5,7,9};
         s.sort(a);
         s.sort(b);
         s.sort(c);
         assertArrayEquals(x, a);
         assertArrayEquals(x, b);
         assertArrayEquals(x, c);
    }
}

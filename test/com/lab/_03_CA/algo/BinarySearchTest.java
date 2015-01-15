/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._03_CA.algo;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author KurtJunsheanEspinosa
 */
public class BinarySearchTest {
    
    public BinarySearchTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of search method, of class BinarySearch.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        Integer o = 1;
        BinarySearch instance = new BinarySearch();
        assertEquals(false, instance.search(o));
        instance.insert(o);
        assertEquals(true, instance.search(o));
    }

    /**
     * Test of insert method, of class BinarySearch.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Integer i = 1;
        BinarySearch instance = new BinarySearch();
        instance.insert(i);
        assertEquals(true,instance.search(i) );
    }

    /**
     * Test of clear method, of class BinarySearch.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        Integer i = 1;
        BinarySearch instance = new BinarySearch();
        instance.insert(i);
        assertEquals(true, instance.search(i));
        instance.clear();
        assertEquals(false, instance.search(i));
    }
}

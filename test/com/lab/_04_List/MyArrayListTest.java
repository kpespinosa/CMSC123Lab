/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._04_List;

import java.util.ArrayList;
import java.util.Iterator;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author KurtJunsheanEspinosa
 */
public class MyArrayListTest {
    
    

    /**
     * Test of contains method, of class MyArrayList.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object item = null;
        MyArrayList instance = new MyArrayList();
        ArrayList a = new ArrayList();
        a.add("hello");
        instance.add("hello");
        assertEquals(instance.contains("hello"), a.contains("hello"));
        assertEquals(instance.contains("hi"), a.contains("hi"));
    }
    
    /**
     * Test of addAll method, of class MyArrayList.
     */
    @Test
    public void testAddAll() {
        System.out.println("addAll");
        ArrayList items = new ArrayList();
        items.add("1");
        items.add("2");
        
        MyArrayList instance = new MyArrayList();
        ArrayList a = new ArrayList();
        
        a.addAll(items);
        
        assertEquals(items.size(), a.size());

        instance.addAll(items);
        assertEquals(items.size(), instance.size());
        
    }
}

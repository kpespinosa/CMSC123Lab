/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._04_List;

import java.util.Iterator;
import java.util.LinkedList;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author KurtJunsheanEspinosa
 */
public class MyLinkedListTest {
    
  
    /**
     * Test of contains method, of class MyLinkedList.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object item = null;
        MyLinkedList instance = new MyLinkedList();
        LinkedList l = new LinkedList();
        instance.add("1");
        l.add("1");
        assertEquals(l.contains("1"), instance.contains("1"));
        
        
    }

    

    /**
     * Test of removeAll method, of class MyLinkedList.
     */
    @Test
    public void testRemoveAll() {
        System.out.println("removeAll");
        LinkedList items = new LinkedList();
        items.add("1");
        items.add("2");
        MyLinkedList a = new MyLinkedList();
        a.add("1");
        a.add("2");
        LinkedList b = new LinkedList();
        items.add("1");
        items.add("2");
        b.removeAll(items);
        a.removeAll(items);
        assertEquals(a.size(), b.size());
    }

    /**
     * Test of addFirst method, of class MyLinkedList.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        Object e = null;
        MyLinkedList instance = new MyLinkedList();
        LinkedList l = new LinkedList();
        l.addFirst("1");
        l.addFirst("2");
        instance.addFirst("1");
        instance.addFirst("2");
        assertEquals(instance.removeFirst(), l.removeFirst());
    }

    /**
     * Test of addLast method, of class MyLinkedList.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        Object e = null;
        MyLinkedList instance = new MyLinkedList();
        LinkedList l = new LinkedList();
        l.addLast("1");
        l.addLast("2");
        instance.addLast("1");
        instance.addLast("2");
        assertEquals(instance.removeLast(), l.removeLast());
    }

    /**
     * Test of removeFirst method, of class MyLinkedList.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        MyLinkedList instance = new MyLinkedList();
        LinkedList l = new LinkedList();
        l.addFirst("1");
        l.addLast("2");
        
        instance.addFirst("1");
        instance.addLast("2");
        
        assertEquals(instance.removeFirst(), l.removeFirst());
    }

    /**
     * Test of removeLast method, of class MyLinkedList.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        MyLinkedList instance = new MyLinkedList();
        LinkedList l = new LinkedList();
        l.addLast("1");
        l.addFirst("2");
        instance.addLast("1");
        instance.addFirst("2");
        assertEquals(instance.removeLast(), l.removeLast());
    }

    /**
     * Test of getFirst method, of class MyLinkedList.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        MyLinkedList instance = new MyLinkedList();
        LinkedList l = new LinkedList();
        l.addFirst("1");
        l.addFirst("2");
        instance.addFirst("1");
        instance.addFirst("2");
        assertEquals(instance.getFirst(), l.getFirst());
    }

    /**
     * Test of getLast method, of class MyLinkedList.
     */
    @Test
    public void testGetLast() {
        System.out.println("getLast");
        MyLinkedList instance = new MyLinkedList();
        LinkedList l = new LinkedList();
        l.addLast("1");
        l.addLast("2");
        instance.addLast("1");
        instance.addLast("2");
        assertEquals(instance.getLast(),l.getLast());
    }
}

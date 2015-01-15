/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._labexam;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author KurtJunsheanEspinosa
 */
public class LinkedListTest {
    
    
    /**
     * Test of add method, of class LinkedList.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        LinkedList instance = new LinkedList();
        instance.add("1");
        Node head = instance.getHead();
        assertEquals("1", head.getElement());
        instance.add("2");
        instance.add("3");
        head = instance.getHead();
        assertEquals("3", head.getElement());
        head = instance.getHead();
        assertEquals("2", head.getNext().getElement());
        head = instance.getHead();
        assertEquals("1", head.getNext().getNext().getElement());
        
    }

    /**
     * Test of reverseLinkedList method, of class LinkedList.
     */
    @Test
    public void testReverseLinkedList() {
        System.out.println("reverseLinkedList");
        LinkedList instance = new LinkedList();
        instance.add("1");
        instance.reverseLinkedList(instance.getHead());
        assertEquals("1", instance.getHead().getElement());
        instance.add("2");
        instance.add("3");
        instance.reverseLinkedList(instance.getHead());
        assertEquals("1", instance.getHead().getElement());
        assertEquals("2", instance.getHead().getNext().getElement());
        assertEquals("3", instance.getHead().getNext().getNext().getElement());
    }
}

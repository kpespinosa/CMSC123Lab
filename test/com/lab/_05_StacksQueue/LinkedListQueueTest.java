/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._05_StacksQueue;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author KurtJunsheanEspinosa
 */
public class LinkedListQueueTest {
    /**
     * Test of enqueue method, of class LinkedListQueue.
     */
    @Test
    public void testEnqueue() {
        System.out.println("enqueue");
        Object e = null;
        LinkedListQueue instance = new LinkedListQueue();
        java.util.Queue q = new java.util.LinkedList();
        q.offer("1");
        q.offer("2");
        instance.enqueue("1");
        instance.enqueue("2");
        assertEquals(instance.peek(), q.peek());
    }

    /**
     * Test of dequeue method, of class LinkedListQueue.
     */
    @Test
    public void testDequeue() {
        System.out.println("dequeue");
        LinkedListQueue instance = new LinkedListQueue();
        java.util.Queue q = new java.util.LinkedList();
        q.add("1");
        q.add("2");
        instance.enqueue("1");
        instance.enqueue("2");
        assertEquals(instance.dequeue(), q.remove());
    }

    /**
     * Test of peek method, of class LinkedListQueue.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        LinkedListQueue instance = new LinkedListQueue();
        java.util.Queue q = new java.util.LinkedList();
        q.add("1");
        instance.enqueue("1");
        assertEquals(instance.peek(), q.peek());
        q.add("2");
        assertEquals(instance.peek(), q.peek());
    }

    /**
     * Test of size method, of class LinkedListQueue.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        LinkedListQueue instance = new LinkedListQueue();
        java.util.Queue q = new java.util.LinkedList();
        q.add("1");
        instance.enqueue("1");
        assertEquals(instance.size(), q.size());
        q.remove();
        instance.dequeue();
        assertEquals(instance.size(), q.size());
    }

    /**
     * Test of isEmpty method, of class LinkedListQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        LinkedListQueue instance = new LinkedListQueue();
        java.util.Queue q = new java.util.LinkedList();
        assertEquals(instance.isEmpty(), q.isEmpty());
        q.add("1");
        instance.enqueue("1");
        assertEquals(instance.isEmpty(), q.isEmpty());
    }

    /**
     * Test of empty method, of class LinkedListQueue.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        LinkedListQueue instance = new LinkedListQueue();
        java.util.Queue q = new java.util.LinkedList();
        assertEquals(instance.size(), q.size());
        q.add("1");
        instance.enqueue("1");
        assertEquals(instance.size(), q.size());
        q.clear();
        instance.empty();
        assertEquals(instance.size(), q.size());
    }
}

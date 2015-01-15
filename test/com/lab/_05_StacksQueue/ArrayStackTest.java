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
public class ArrayStackTest {
    
    public ArrayStackTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of push method, of class ArrayStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object e = null;
        ArrayStack instance = new ArrayStack();
        java.util.Stack s = new java.util.Stack();
        s.push("1");
        instance.push("1");
        assertEquals(instance.size(), s.size());
        s.push("2");
        instance.push("2");
        assertEquals(instance.pop(), s.pop());
        assertEquals(instance.size(), s.size());
    }

    /**
     * Test of pop method, of class ArrayStack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        ArrayStack instance = new ArrayStack();
        java.util.Stack s = new java.util.Stack();
        s.push("1");
        instance.push("1");
        assertEquals(instance.size(), s.size());
        s.push("2");
        instance.push("2");
        assertEquals(instance.pop(), s.pop());
        assertEquals(instance.size(), s.size());
    }

    /**
     * Test of top method, of class ArrayStack.
     */
    @Test
    public void testTop() {
        System.out.println("top");
        ArrayStack instance = new ArrayStack();
        java.util.Stack s = new java.util.Stack();
        s.push("1");
        instance.push("1");
        assertEquals(instance.top(), s.peek());
        s.push("2");
        instance.push("2");
        assertEquals(instance.top(), s.peek());
    }

    /**
     * Test of empty method, of class ArrayStack.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        ArrayStack instance = new ArrayStack();
        java.util.Stack s = new java.util.Stack();
        s.push("1");
        s.push("2");
        s.clear();
        instance.push("1");
        instance.push("2");
        instance.empty();
        assertEquals(instance.size(), s.size());
    }

    /**
     * Test of isEmpty method, of class ArrayStack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ArrayStack instance = new ArrayStack();
        java.util.Stack s = new java.util.Stack();
        assertEquals(s.empty(), instance.isEmpty());
        instance.push("1");
        s.push("1");
        assertEquals(instance.isEmpty(), s.empty());
    }

    /**
     * Test of size method, of class ArrayStack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ArrayStack instance = new ArrayStack();
        java.util.Stack s = new java.util.Stack();
        assertEquals(instance.size(), s.size());
        instance.push("1");
        s.push("1");
        assertEquals(instance.size(), s.size());
        instance.pop();
        s.pop();
        assertEquals(instance.size(), s.size());
    }
}

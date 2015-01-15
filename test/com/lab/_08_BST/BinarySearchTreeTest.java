/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._08_BST;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author KurtJunsheanEspinosa
 */
public class BinarySearchTreeTest {

    /**
     * Test of find method, of class BinarySearchTree.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Object x = null;
        
        
        
        BinarySearchTree instance = new BinarySearchTree();
        java.util.TreeSet t = new java.util.TreeSet();
        t.add("1");
        instance.insert("1", )
        assertEquals(true, t.contains("1"));
        
    }

    /**
     * Test of findMin method, of class BinarySearchTree.
     */
    @Test
    public void testFindMin() {
        System.out.println("findMin");
        BinaryNode<AnyType> t = null;
        BinarySearchTree instance = new BinarySearchTree();
        BinaryNode expResult = null;
        BinaryNode result = instance.findMin(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findMax method, of class BinarySearchTree.
     */
    @Test
    public void testFindMax() {
        System.out.println("findMax");
        BinaryNode<AnyType> t = null;
        BinarySearchTree instance = new BinarySearchTree();
        BinaryNode expResult = null;
        BinaryNode result = instance.findMax(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class BinarySearchTree.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Object x = null;
        BinaryNode<AnyType> t = null;
        BinarySearchTree instance = new BinarySearchTree();
        BinaryNode expResult = null;
        BinaryNode result = instance.insert(x, t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class BinarySearchTree.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Object x = null;
        BinaryNode<AnyType> t = null;
        BinarySearchTree instance = new BinarySearchTree();
        BinaryNode expResult = null;
        BinaryNode result = instance.remove(x, t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

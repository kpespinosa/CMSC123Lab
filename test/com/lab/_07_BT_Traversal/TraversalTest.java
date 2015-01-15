/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._07_BT_Traversal;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author KurtJunsheanEspinosa
 */
public class TraversalTest {
    
    public TraversalTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of preorder method, of class Traversal.
     */
    @Test
    public void testPreorder() {
        System.out.println("preorder");
        BinaryNode<AnyType> t = null;
        Traversal instance = new Traversal();
        instance.preorder(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inorder method, of class Traversal.
     */
    @Test
    public void testInorder() {
        System.out.println("inorder");
        BinaryNode<AnyType> t = null;
        Traversal instance = new Traversal();
        instance.inorder(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of postorder method, of class Traversal.
     */
    @Test
    public void testPostorder() {
        System.out.println("postorder");
        BinaryNode<AnyType> t = null;
        Traversal instance = new Traversal();
        instance.postorder(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of levelorder method, of class Traversal.
     */
    @Test
    public void testLevelorder() {
        System.out.println("levelorder");
        BinaryNode<AnyType> t = null;
        Traversal instance = new Traversal();
        instance.levelorder(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

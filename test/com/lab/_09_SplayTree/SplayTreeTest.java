/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._09_SplayTree;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author KurtJunsheanEspinosa
 */
public class SplayTreeTest {
  
    /**
     * Test of splayTest method, of class SplayTree.
     */
    @Test
    public void testSplayTest() {
        System.out.println("splayTest");
        SplayTree instance = new SplayTree();
        assertEquals(true, instance.splayTest());
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._06_Trees;

/**
 *
 * @author KurtJunsheanEspinosa
 * Note: Might have to exclude this as one of the exercises. 
 */
public class Tree {

    public void listAll(String rootPath) {
        //#1 code here
    }

    public void listAllWithSizes(String rootPath) {
        //#2 code here
    }

    public void constructExpressionTree(String postfix) {
        //#3 code here. You may use the Stack in Java. To check, do a preorder traversal of the created expression tree.
    }
}

class BinaryNode<AnyType> {

    AnyType element;
    BinaryNode<AnyType> left;
    BinaryNode<AnyType> right;
}
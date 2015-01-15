/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._08_BST;

import java.util.Comparator;

/**
 *
 * @author KurtJunsheanEspinosa
 */
public class BinarySearchTree<AnyType> {

    private Comparator<? super AnyType> cmp;
    private BinaryNode<AnyType> root;
    private int size;

    public BinarySearchTree() {
        this(null);
    }

    public BinarySearchTree(Comparator<? super AnyType> c) {
        root = null;
        cmp = c;
    }

    private int myCompare(AnyType lhs, AnyType rhs) {
        if (cmp != null) {
            return cmp.compare(lhs, rhs);
        } else {
            return ((Comparable) lhs).compareTo(rhs);
        }
    }

    public boolean find(AnyType x, BinaryNode<AnyType> t) {
        //code here
        return false;
    }

    public BinaryNode<AnyType> findMin(BinaryNode<AnyType> t) {
        //code here
        return null;
    }

    public BinaryNode<AnyType> findMax(BinaryNode<AnyType> t) {
        //code here
        return null;
    }

    public BinaryNode<AnyType> insert(AnyType x, BinaryNode<AnyType> t) {
        //code here
        return null;
    }

    public BinaryNode<AnyType> remove(AnyType x, BinaryNode<AnyType> t) {
        //code here
        return null;
    }
}

class BinaryNode<AnyType> {

    private AnyType element;
    private BinaryNode<AnyType> left;
    private BinaryNode<AnyType> right;
}
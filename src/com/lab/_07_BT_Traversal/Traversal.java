/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._07_BT_Traversal;

/**
 *
 * @author KurtJunsheanEspinosa
 */
public class Traversal<AnyType> {

    void preorder(BinaryNode<AnyType> t) {
        System.out.println(t.element);
        preorder(t.left);
        preorder(t.right);
    }

    void inorder(BinaryNode<AnyType> t) {
        preorder(t.left);
        System.out.println(t.element);
        preorder(t.right);
    }

    void postorder(BinaryNode<AnyType> t) {
        preorder(t.left);
        preorder(t.right);
        System.out.println(t.element);
    }

    void levelorder(BinaryNode<AnyType> t) {
        
    }
}

class BinaryNode<AnyType> {

    AnyType element;
    BinaryNode<AnyType> left;
    BinaryNode<AnyType> right;
}

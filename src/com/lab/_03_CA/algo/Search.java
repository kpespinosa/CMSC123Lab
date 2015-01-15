/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._03_CA.algo;

/**
 *
 * @author KurtJunsheanEspinosa
 * This interface only accepts integer.
 * Extension can be made for this to accept generics. 
 */
public interface Search {
    public boolean search(Integer o);
    public void insert(Integer o);
    public void clear();
}

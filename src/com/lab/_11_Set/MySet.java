/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._11_Set;

/**
 *
 * @author KurtJunsheanEspinosa
 */
public interface MySet<T> {

    public MySet<T> union(MySet<T> setA, MySet<T> setB);
    
    public MySet<T> unionAll(MySet<T> setA, MySet<T> setB);

    public MySet<T> intersection(MySet<T> setA, MySet<T> setB);

    public MySet<T> difference(MySet<T> setA, MySet<T> setB);

    public MySet<T> symDifference(MySet<T> setA, MySet<T> setB);

    public boolean isSubset(MySet<T> setA, MySet<T> setB);

    public boolean isSuperset(MySet<T> setA, MySet<T> setB);
}

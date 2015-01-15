/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._12_Hashtable;

/**
 *
 * @author KurtJunsheanEspinosa
 */

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author KurtJunsheanEspinosa
 */
public interface Dictionary {

    public void insert(Object key, Object value);

    public boolean find(Object key);

    public Entry remove(Object key);

    public int size();
}

class Entry {

    Object key;
    Object value;

    Entry(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
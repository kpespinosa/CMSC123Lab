/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._12_Hashtable;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
import java.util.LinkedList;

/**
 *
 * @author KurtJunsheanEspinosa
 */
public class HashtableChaining implements Dictionary {

    Object[] table;
    int n;//number of elements in the hashtable
    int N;
    double enlargeFactor;
    double shrinkFactor;

    public HashtableChaining(int N) {
        this(N, 0.75, 0.25);
    }

    public HashtableChaining(int N, double enlargeFactor, double shrinkFactor) {
        //implement resizing
        this.N = N;
        this.enlargeFactor = enlargeFactor;
        this.shrinkFactor = shrinkFactor;
        table = new Object[N];
        for (int i = 0; i < N; i++) {
            table[i] = new LinkedList();
        }
    }

    @Override
    public void insert(Object key, Object value) {
        ((LinkedList) table[index(key)]).add(new Entry(key, value));
        n++;
    }

    @Override
    public boolean find(Object key) {
        LinkedList l = ((LinkedList) table[index(key)]);
        for (int i = 0; i < l.size(); i++) {
            Entry e = (Entry) l.get(i);
            if (e.getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Entry remove(Object key) {
        //implement shrinking
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int index(Object key) {
        return (127 * key.hashCode() % 16908799) % N;
    }

    @Override
    public int size() {
        return n;
    }
}

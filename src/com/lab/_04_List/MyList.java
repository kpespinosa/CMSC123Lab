/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._04_List;

import java.util.Iterator;



/**
 *
 * @author KurtJunsheanEspinosa
 */
public interface MyList<E> extends Iterable<E>{     
	void add(E item);     
	void add(int pos, E item);     	
        boolean contains(E item);     
	int size();     
	boolean isEmpty();     
	E get(int pos);     
	E remove(int pos); 
        void clear();
	Iterator<E> iterator( ); 

}


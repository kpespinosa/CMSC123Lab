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

public class MyArrayList<E> implements MyList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int theSize;
    private E [ ] theItems;
    
    public MyArrayList( ) { 
        doClear( ); 
    }
    
    public void clear( ) { 
        doClear( ); 
    }
    
    private void doClear( )
    { 
        theSize = 0; 
        ensureCapacity( DEFAULT_CAPACITY ); 
    }
    
    public void ensureCapacity( int newCapacity ) {
        if( newCapacity < theSize ) return;
        E [ ] old = theItems;
        theItems = (E []) new Object[ newCapacity ]; 
        for(int i=0;i<size();i++)
            theItems[ i ] = old[ i ]; 
    }
    
    
    @Override
    public void add(E item) {
        add( size( ), item );
    }

    @Override
    public void add(int pos, E item) {
        if( theItems.length == size( ) ) 
            ensureCapacity( size( ) * 2 + 1 );
        for(int i=theSize; i>pos; i--) 
            theItems[ i ] = theItems[ i - 1 ];
        
        theItems[ pos ] = item;
        theSize++;
    }

    @Override
    public boolean contains(E item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int size() {
        return theSize; 
    }

    @Override
    public boolean isEmpty() {
        return size( ) == 0;
    }
    
    public void addAll( Iterable<? extends E> items ){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E get(int pos) {
        if( pos < 0 || pos >= size( ) )
            throw new ArrayIndexOutOfBoundsException( );
        return theItems[ pos ];
    }

    @Override
    public E remove(int pos) {
        E removedItem = theItems[ pos ]; 
        for(int i=pos;i <size()-1;i++ )
            theItems[ i ] = theItems[ i + 1 ];
        theSize--;
        return removedItem;
    }

    public void trimToSize( ){ 
        ensureCapacity( size( ) ); 
    }
    
    @Override
    public Iterator<E> iterator() {
        return new ArrayListIterator( ); 
    }
    
   
    private class ArrayListIterator implements java.util.Iterator<E> {
             private int current = 0;
             
             public boolean hasNext( ){ 
                   return current < size( ); 
               }
             public E next( ){ 
                 return theItems[ current++ ];
             }
             public void remove( ){ 
                 MyArrayList.this.remove( --current );
             }
    }
    
}


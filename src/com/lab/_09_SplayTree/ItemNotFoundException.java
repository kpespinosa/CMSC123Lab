/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._09_SplayTree;

/**
 *
 * @author KurtJunsheanEspinosa
 */


/**
 * Exception class for failed finds/removes in search
 * trees, hash tables, and list and tree iterators.
 * @author Mark Allen Weiss
 */
class ItemNotFoundException extends RuntimeException
{
    /**
     * Construct this exception object.
     */
    public ItemNotFoundException( )
    {
        super( );
    }
    
    /**
     * Construct this exception object.
     * @param message the error message.
     */
    public ItemNotFoundException( String message )
    {
        super( message );
    }
}



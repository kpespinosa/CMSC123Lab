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
 * Exception class for duplicate item errors
 * in search tree insertions.
 * @author Mark Allen Weiss
 */
class DuplicateItemException extends RuntimeException
{
    /**
     * Construct this exception object.
     */
    public DuplicateItemException( )
    {
        super( );
    }
    /**
     * Construct this exception object.
     * @param message the error message.
     */
    public DuplicateItemException( String message )
    {
        super( message );
    }
}
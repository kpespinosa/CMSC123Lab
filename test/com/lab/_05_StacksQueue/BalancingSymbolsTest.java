/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._05_StacksQueue;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author KurtJunsheanEspinosa
 */
public class BalancingSymbolsTest {
   
    /**
     * Test of isBalanced method, of class BalancingSymbols.
     */
    @Test
    public void testIsBalanced() {
        System.out.println("isBalanced");
        String[] balanced = {
                        "{}<>()",
                        "{([])}",
                        "{([4*2]+2)+(3/[2+3])}",
                        "[()]{}{[()()]()}",
                        "",
                        "(function(){return [new Bears()]}());",
                        "var a = function(){return 'b';}",
                        "/*Comment: a = [} is bad */var a = function(){return 'b';}",
                        "/*[[[ */ function(){return {b:(function(x){ return x+1; })('c')}} /*_)(([}*/",
                        "//Complex object;\n a = [{a:1,b:2,c:[ new Car( 1, 'black' ) ]}]"
                        };
        String[] notBalanced = {
                        "{([])",
                        "[[(])]",
                        "[(])",
                        "{",
                        "{]",
                        "{}(",
                        "({)()()[][][}]",
                        "[//]",
                        "[/*]*/",
                        "(function(){return [new Bears()}())];",
                        "var a = [function(){return 'b';]}",
                        "/*Comment: a = [} is bad */var a = function({)return 'b';}",
                        "/*[[[ */ function(){return {b:(function(x){ return x+1; })'c')}} /*_)(([}*/",
                        "//Complex object;\n a = [{a:1,b:2,c:[ new Car( 1, 'black' ) ]]"
                        };
        
        BalancingSymbols instance = new BalancingSymbols();
        for(String s:balanced)
            assertEquals(true, instance.isBalanced(s));
        for(String s:notBalanced)
            assertEquals(false, instance.isBalanced(s));
     }
    
        
    }
    


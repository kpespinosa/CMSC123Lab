/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._10_ThreadedBTandTrie.sample;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author KurtJunsheanEspinosa
 */
public class TryTrie {
    public static void main(String[] args) {
        Trie t = new Trie();
        t.addWord("hello");
        t.addWord("hellen");
        t.addWord("hey");
        t.addWord("hen");
        List l = t.getWords("hel");
        Iterator i = l.iterator();
        while(i.hasNext())
            System.out.println(i.next());
    }
   
}

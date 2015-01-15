/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._11_Set;

/**
 *
 * @author KurtJunsheanEspinosa
 */
import java.io.*;
import java.util.Enumeration;
import java.util.TreeSet;
import java.util.Set;


class SpellCheck {

	private static Set readWords (Reader in) throws IOException {
		Set result = new TreeSet();
		StreamTokenizer tok = new StreamTokenizer(in);
		tok.ordinaryChar('.');
		tok.lowerCaseMode(true);
		int c = tok.nextToken();
		while (c != StreamTokenizer.TT_EOF) {
			if (c == StreamTokenizer.TT_WORD)  {
                                result.add(tok.sval);
			}
			c = tok.nextToken();
		}
		return result;
	}

	static public void main (String [ ] args) {
		try {
			// read the two sets of words
		Set dict = readWords(new FileReader("words"));
		Set doc = readWords(new FileReader("input"));

			// remove the correctly spelled words
		doc.difference(dict);

			// now print the misspellings
		Enumeration e = doc.elements();
		while (e.hasMoreElements()) 
			System.out.println(e.nextElement());
		} catch (IOException e) { System.err.println("exception:"+e); }
	}
}

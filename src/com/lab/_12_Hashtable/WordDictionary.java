/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._12_Hashtable;

/**
 *
 * @author KurtJunsheanEspinosa
 */
public class WordDictionary {
    private Definition[] defTable = new Definition[Word.WORDS];
    
    public void insert(Word w, Definition d){
        defTable[w.hashCode()] = d;
    }
    
    Definition find(Word d){
        return defTable[d.hashCode()];
    }
    public static void main(String[] args) {
        WordDictionary w = new WordDictionary();
        Word aa = new Word("aa");
        Word bb = new Word("bb");
        Word zz = new Word("zz");
        Word zza = new Word("zza");
        w.insert(aa, new Definition("aad"));
        w.insert(bb, new Definition("bbd"));
        w.insert(zz, new Definition("zzd"));
        w.insert(zza, new Definition("zza"));
        System.out.println(w.find(aa).getDefinition());
        System.out.println(w.find(bb).getDefinition());
        System.out.println(w.find(zz).getDefinition());
        System.out.println(w.find(zza).getDefinition());
        
        System.out.println(zz.hashCode());
        System.out.println(zza.hashCode());
    }
}


class Word{
    public static final int LETTERS = 26,
                            WORDS = LETTERS * LETTERS;
    private String word;
    Word(String word){
        this.word = word;
    }
    public int hashCode(){
        return LETTERS*(word.charAt(0)-'a') + (word.charAt(1)-'a');
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
    
}

class Definition{
    String definition;
    
    Definition(String definition){
        this.definition = definition;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}



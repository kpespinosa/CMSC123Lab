/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._01_OOPGenerics;

import com.lab._01_OOPGenerics.AsianSpirit;
import com.lab._01_OOPGenerics.Airline;
import com.lab._01_OOPGenerics.CebuPac;

/**
 *
 * @author KurtJunsheanEspinosa
 */
public class Test {
    public static void main(String[] args) {
//        Student a = new Student("Kurt");
//        Student b = new Student("Jay");
//        System.out.println(a.compareTo(b));
        
//        Mammal a = new WildCat();
//        a.eat();
//        //a.hunt();
//        System.out.println();
        
//        Animal[] a = {new Dog(), new Cat(), new Duck()};
//        for(Animal ar:a){
//            ar.speak();
//        }
        Airline[] a = {new CebuPac(), new AsianSpirit()};
        for(Airline ar:a){
            ar.fly();
        }
    }
}
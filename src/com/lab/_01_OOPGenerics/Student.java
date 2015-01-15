/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab._01_OOPGenerics;

/**
 *
 * @author KurtJunsheanEspinosa
 */
public class Student {
    int age;
    String name;
    Student(int age){
        name = "";
        this.age = age;
    }
    Student(String name){
        this.name = name;
        age = 0;
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    Student(){
        this("",0);
    }
    
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    int compareTo(Student s){
        if(this.getAge()<s.getAge()) return -1;
        else if(this.getAge()>s.getAge()) return 1;
        else    return 0;
    }
    
}

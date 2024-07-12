package org.example.OOPs.Abtraction;

abstract public class Abstraction {

    public void sum(int a, int b){
        System.out.println("At abtraction class. Sum = "+a+b);
    }

    abstract public int multiply (int a , int b); // abstract method doesn't have any block (body) , mode in only abstract class.

}

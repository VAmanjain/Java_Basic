package org.example.OOPs.Abtraction;



/*
 * Abstraction : hiding method body
 * 1. abstract class
 * 2. interface
 * */

public class Main {
    public static void main(String[] args) {
        Abstraction abstraction = new ClassWithAbstractClassExtends();
        abstraction.sum(4,5);
        int res = abstraction.multiply(4,6);
        System.out.println("At abstract example ( classWithAbtractClassExtends) . value = "+res);

        Interface example = new ClassWithAbstractClassExtends();
        example.sum1(4,6);
    }
}

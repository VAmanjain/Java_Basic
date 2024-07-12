package org.example.OOPs.Inhertance;

public class GrandParent {
    GrandParent(){
        System.out.println("At Grand Parent Class.");
    }

    GrandParent(String name){
        System.out.println("Grand Parent Class constructor with parameter. -- "+ name);
    }

    int sum (int a , int b){
        System.out.println("At GrandParent sum method.");
        return a+b;
    }
}

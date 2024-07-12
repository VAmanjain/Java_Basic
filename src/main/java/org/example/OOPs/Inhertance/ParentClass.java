package org.example.OOPs.Inhertance;

public class ParentClass extends GrandParent {
    ParentClass(){
        System.out.println("At ParentClass.");
    }

    ParentClass(String name){
        super(name);
        System.out.println("At ParentClass - called grand parent parameter class.");
    }

    int  sum (int a , int b){
        System.out.println("At Parent Class sum method.");
        return a+b;
    }

    int multipy (int a , int b){
        System.out.println("At Parent Class multiply method.");
        return a*b;
    }

    int sub (int a , int b){
        System.out.println("At Parent Class subtraction method.");
        return a-b;
    }
}

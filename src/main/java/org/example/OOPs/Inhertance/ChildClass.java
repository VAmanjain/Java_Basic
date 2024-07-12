package org.example.OOPs.Inhertance;

public class ChildClass extends ParentClass {
    ChildClass(){
        System.out.println("At Child Class.");
        System.out.println(super.sum(5,5));// super keyword give reference of Parent Class (extends class) .
        System.out.println(sum(5,5));
        System.out.println(multipy(5,5));

        // Call grandparent class same name function.
//        new GrandParent("").sum(1,5);
       int res= ((GrandParent)this).sum(3,2); // this not calling grand parent classs instead of calling child class because of preference.( Dynamic binding)
        System.out.println("At grand Parent sum method--"+res);

    }

    ChildClass(String name){
        super(name);
        System.out.println("Child constructor.-parameter parent class called.");
    }
    int sum (int a , int b){
        System.out.println("At Child Class sum method.");
        return a+b;
    }

    int divide (int a, int b){
        System.out.println("At Child Class Divide method. ");
        return a/b;
    }
}

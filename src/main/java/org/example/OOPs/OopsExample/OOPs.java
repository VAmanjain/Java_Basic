package org.example.OOPs.OopsExample;


/*
* 1. class-object
* 2. Constructor
* 3. inheritance
* 4.Abtraction
* 5.polymorphism
* 6.encapsulation
* 7.agggreation : has a relation
* */


public class OOPs {
    public static void main(String[] args) {
        System.out.println("At OOPs Example.");
        Parent parent = new Parent();
        System.out.println(parent.name);
        Student student = new Student(101, "Ganga");
    }

    {
        System.out.println("At block statement of Static main method class."); // when static void main function in class then priority of block statement ends.
    }
}

package org.example.OOPs.Inhertance;

public class hierarchical_Inheritance {
    public static void main(String[] args) {
        System.out.println("at Hirarchial Inheritance example.");

        B b = new B();

    }
}


class A{
    String name = "Aman";
}

class B extends  A{
    int id= 5;
}

class C extends A{
    String description = "Software Engineer";
}
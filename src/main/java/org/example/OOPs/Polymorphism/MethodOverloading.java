package org.example.OOPs.Polymorphism;

/*
* Method overloading : Same method name with different argument.
* */

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(sum(4,6));
        System.out.println(sum(4.6f,6.7f));
        System.out.println(sum(4.1,6.3));
        System.out.println(sum("4","6"));

    }

    public static int sum(int a , int b){
        System.out.println("Sum method with 2 int argument: ");
        return a+b;
    }
    public static float sum(float a , float b){
        System.out.println("Sum method with 2 float argument: ");
        return a+b;
    }

    public static double sum(double a, double b){
        System.out.println("Sum method with 2 double argument: ");
        return  a+b;
    }

    public static double sum(String a, String  b){
        System.out.println("Sum method with 2 String  argument return double: ");
        return  Double.parseDouble(a)+Double.parseDouble(b);
    }
}

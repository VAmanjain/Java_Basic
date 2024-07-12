package org.example.OOPs.Abtraction;

// Interface btw has abstract method.

public interface Interface {
     static void main(String[] args) {
         System.out.println("At Interface main method. ");
    }

    int sum1(int a, int b);

     static int multiply (int a, int b){
         return a *b;
     }
     default int divide (int a, int b ){
         return a/b;
     }
}

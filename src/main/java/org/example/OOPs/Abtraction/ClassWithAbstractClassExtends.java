package org.example.OOPs.Abtraction;

public class ClassWithAbstractClassExtends extends Abstraction implements Interface {


    @Override
    public int sum1(int a, int b) {
        return a+b;
    }

    @Override
    public int multiply(int a, int b) {
        return a*b;
    }

    // This is not called in main because reference class is Abstraction.
    public int divide (int a, int b ){
        return a/b;
    }
}

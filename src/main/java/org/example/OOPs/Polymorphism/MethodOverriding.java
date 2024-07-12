package org.example.OOPs.Polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        A b= new B(); // dynamic binding or upcasting => CLass property priority is higher then reference.
        System.out.println(b.sum(2,3));
        System.out.println(b.multply(2,3));

    }
}

class A{
    A(){
        System.out.println("At class A.");
    }

    public int sum(int a, int b){
        System.out.println("A");
        return a+b;
    }

    public int multply(int a , int b){
        System.out.println("A with multply.");
        return a*b;
    }
}

class  B extends A{
    B(){
        System.out.println("At class B.");
    }

    //Over Riding
    @Override
    public int sum (int a, int b){
        System.out.println("B");
        return a+b;
    }

    //OverLoading
    public double sum (double a, double b){
        System.out.println("B with double");
        return a+b;
    }

}

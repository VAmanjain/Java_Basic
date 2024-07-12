package org.example.OOPs.InnerClass;

public class StaticInnerClass {
    static int a = 5;
    static class StaticInner{
        int a = 20;
        int b = 10;

        void showData(){
            System.out.println("At static inner class.");
            System.out.println(a);
        }
    }
}

package org.example.java_overview;

/*
    java overview
    1. keywords: 51 approx
    2. access modifier: public, private, protected and default
        public: allow outside with different package
        private: allow only same class
        default: allow only same package
        protected: allow only same package and on sublcass also
    3. data types:
        primitive:
        int, float, double, char, boolean, byte,
        non-primitive:
        String,
        Array,
        Object
    4. variable: local, instance and static
    5. methods: normal, static

 */

public class FirstOverview {
    int a = 10; // different scope from main method (instance variable ) -- class level

    protected static int b =6;
    int no = 16; // instance variable can't use in static method

//    Static method
    public static void main (String [] args){
        FirstOverview firstOverview = new FirstOverview();
        int a= 10 ;//local variable -- method level
        System.out.println(b); // static var use
        float b = 10.0f;
        System.out.println(b); // method var use
        System.out.println(FirstOverview.b); // static var use
        double c = 10.09;
        byte d = 127;

        System.out.println("byte d is  " +Integer.toBinaryString(d));
           System.out.println( a +  " at First Example.");
        firstOverview.sum(10, 5);
        subtrack(10, 5);
    }

//    normal methods
    public int sum (int a, int b ){
        System.out.println(no);
        System.out.println(b);
        return a+b;
    }
    public static int subtrack (int a , int b ){
        return a-b;
    }

}

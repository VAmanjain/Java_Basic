package org.example.Assignment;

public class LoopStatment {
    public static void main(String[] args) {
        System.out.println("Assigmmnet 1:-");
        assignment1();
        System.out.println();
        System.out.println("Assigmmnet 2:-");
        assigment2();
        System.out.println();
        System.out.println("Assigmmnet 3:-");
        assignment3();
        System.out.println();
        System.out.println("Assigmmnet 4:-");
        assigment4();
        System.out.println();
        System.out.println("Assigmmnet 5:-");
        assignment5();
        System.out.println();
        System.out.println("Assigmmnet 6:-");
        assignment6();
    }
    public static void assignment1(){
        int n=0, i=1;
        while (i<=6){
            n=n+i;
            i++;
            System.out.print(n+", ");
        }
    }
    public static void assigment2(){
        int n=0 ;
        for (int i=1;i<=5;){
            n=n+i;
            i++;
            System.out.print(n+", ");
        }
        for (int i=1;i<=5;){
            n=n-i;
            i++;
            System.out.print(n+", ");
        }
    }
    public  static  void assignment3(){
        int n= 1 , a=4;
        System.out.print(n+", ");
        for (int  i =1; i <7; i++){
            if (i%2==0){
                a=5;
                n=n+a;
            }
            else {
                a=4;
                n=n+a;
            }
            System.out.print(n+", ");
        }
    }
    public static void assigment4(){
        int n= 0 , a;
        System.out.print(n+", ");
        for (int  i =1; i <7; i++){
            if (i%2==0){
                a=1;
                n=n+a;
            }
            else {
                a=2;
                n=n+a;
            }
            System.out.print(n+", ");
        }
    }
    public static void assignment5(){
        int n=30, a;
        System.out.print(n+", ");
        for (int i =1; i <=8; i++){
            if (i%2==0){
                a=4;
                n=n-a;
            }
            else {
                a=3;
                n=n-a;
            }
            System.out.print(n+", ");
        }
    }
    public static void assignment6(){
        int n=1, a=0;
        System.out.print(n+", ");
        for (int i =1; i<6; i++){
            a+=2;
            n=n+a;
            System.out.print(n+", ");
        }

    }
}

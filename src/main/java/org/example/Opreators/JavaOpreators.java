package org.example.Opreators;


/*
    operators;
    1. Arithematic: +, -, *, %, /
    2. Increment / Decrement: ++, -- ( prefix and postfix)
    3. Relational: ==, <, > <=, >=
    4. Assignment: +=, -=, *=, /=, %=
    5. Logical: &&, ||
    6. Bitwise ( shift operator), &, |, left shift, right shift, unsigned right shift
    7. Ternary: ? :

 */


// we can only  create a static variable as instanace variable not local variable

public class JavaOpreators {
      public  static  void main(String []args){
          System.out.println("At java opreator Exmaple");
//          arthematicOpreator();
//          incrementDecrementOPreator();
//          BitwiseOpreator();
//          logicalOpreator();
//          AssignmentOpreator();
          tarnaryOpreator();

      }
      public  static  void arthematicOpreator(){
          int a = 10;
          int b = 5 ;
          int c = a + b * a / (b + a);
      System.out.println(a+b);
          System.out.println(a-b);
          System.out.println(a*b);
          System.out.println(a/b);
          System.out.println(a%b);
          System.out.println(c);
      }
      public static  void incrementDecrementOPreator(){
          int a = 10;

          a = a++; // we can't assign increment of variable into same variable.
          int b = a++;
          System.out.println(a);
          System.out.println(a);
          System.out.println(b);


      }
      public static void BitwiseOpreator(){
          int a = 10;
          int b = 5;
          System.out.println(Integer.toBinaryString(a));
          System.out.println(Integer.toBinaryString(b));
          System.out.println(Integer.toBinaryString(15));
          System.out.println(Integer.toBinaryString(2));
          System.out.println(Integer.toBinaryString(-2));
          System.out.println();
          System.out.println(a | b);
          System.out.println(20<<2); // left shit
          System.out.println(20>>2);

      }

      public static void logicalOpreator(){

          /*
          *         logical AND &&
          *  Condition1  condition2  result
          *     t            t          t
          *     t            f          f
          *     f            t          f
          *     f            f          f
          * */

          /*
           *         logical OR ||
           *  Condition1  condition2  result
           *     t            t          t
           *     t            f          t
           *     f            t          t
           *     f            f          f
           * */

          int a= 10;
          int b= 5;
          if ( a < b && a == b || a > b && a < b ){
              System.out.println("inside if");
          }
          else {
              System.out.println("inside else");
          }
      }

      public static void AssignmentOpreator(){
          // += -= *= /= %=
          int a = 10;
          a += 5; // a = a +  5
          System.out.println(a+=5);
          int n =20;

          for (int i = 0 ; i <  n ; i += 2){
              System.out.println(i);
          }
      }

      public static void tarnaryOpreator(){
          // ? :
          int a = 10 ;
          int b = 7;
          int c = 6;
          String greaterValue = null; // we need to define variable into methods ( Local variable)
//
//          if (a>b && a>c){
//              greaterValue = "A";
//          }
//          else {
//              if ( b> c){
//                  greaterValue= "B";
//              }
//              else
//              {
//                  greaterValue="c";
//              }
//          }
//
//
          greaterValue =  a > b ? a > c ? "A" : "C" : b > c ? "B" : "C";
          System.out.println(greaterValue);

      }


}

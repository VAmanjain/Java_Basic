package org.example.LoopStatement;

public class LoopStatment {

    public static  void main(String []args){
        // initialization ; condition ; increment/decrement
        for (int i = 0 ; i <10 ; i++){
            System.out.print(i);
        }
        System.out.println();
        System.out.println("now using while loop: ");

        int i = 0;
        while(i <10){
            i++;
        }
        System.out.println(i);

        System.out.println("Using do while loop : ");

        int j = 0;

        do{
            System.out.print(j);
            j++;
        }
        while (j<10);
        System.out.println();
        System.out.println("Using enhance loop  ");

        int[] arr = {2,3,4,5,6};

        for(int value: arr){
            System.out.println(value);
        }

        String []names = {"aman", "simran", "ashwin","kapil"};

        for (String name:names){
            System.out.println(name);
        }

        var testVar = "aman"; //  var can accept any type of input only in  first time . If we assign a int we can't change it into another datatype(String).

        System.out.println("test var is "+testVar);




    }



}

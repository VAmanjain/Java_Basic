package org.example.Arrays;


/*
* Array:-
* 1. Single Dimension
* 2. Multi Dimension
* 3. Jadgged Arrray
* */

public class Arrays {
    public static void main(String[] args) {
//        String name = "ashwin";
        String [] names = {"aman","Devashish", "Ankit", "Ganga" };
        System.out.println(names); // print the deafult values of array (address)
        for (String name: names){
            System.out.print(name+" ");
        }

        String []  multiArr = new String[3];
        System.out.println(multiArr);

    }
}

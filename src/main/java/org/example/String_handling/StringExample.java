package org.example.String_handling;

/*
* String:
* 1.inmutable
* 2.== check reference
*
* */

public class StringExample {
    public static void main(String[] args) {
        String name = "Aman";
        System.out.println(name);
        name.concat("Deva");
        System.out.println(name);

        String name2= new String("Aman");
        System.out.println(name2);

    }
}

package org.example.Scanner_Class;
import java.util.Scanner;

/*
 Scanner: read input stream: file, string, System.in, stream
 next():- only before space
 nextLine():- read complete line
 nextInt():- read interger value
 hasNext():- check input type.

 delimiter : scanner has default delimiter as white space. (use in next() method)
 we can change delimiter using useDelimiter method.
 */

public class ScannerClassExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any text: ");
        String value = sc.nextLine();
        System.out.println("Enter text as " + value);
        System.out.println("Please enter any value: ");

        if(sc.hasNextInt()) { //hasNextInt check is enter a value int or not. if yes then allow the value to read otherwise not allow the read.
            int val = sc.nextInt();
            System.out.println("Enter text as " + val);
        }

        sc.useDelimiter(",");// pattern work as splitter in line.
        String secondValue= sc.next();
        System.out.println(secondValue);

        while (sc.hasNext()){
            String newValue = sc.next();
            System.out.println("Enter a value is "+ newValue);
            if (newValue.equalsIgnoreCase("exit")){
                break;
            }
        }
    }
}

package org.example.Arrays;
import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        // First way of define method
        String[][] values = {{"aman", "deva"}, {"ankit", "ganga"}};
        System.out.println(Arrays.toString(values));

        for (int i=0; i< values.length; i++){
            for (int j =0 ; j < values[i].length; j++){
                System.out.print(values[i][j]+" ");
            }
            System.out.println();
        }

        // Second way of define method

        String[][] names = new String[2][2];// We can make column dynamic in java.
        names[0][0]="aman";
        names[0][1]="avnik";
        names[1][0]="Deva";
        names[1][1]="ankit";


        for (int i=0; i< names.length; i++){
            for (int j =0 ; j < names[i].length; j++){
                System.out.print(names[i][j]+" ");
            }
            System.out.println();
        }

        // jagged Array => rows fixed but column can different.

        String [][]collegeCourse =
                {{"b.tech", "m.tech"}, {"b.a", "b.sc", "b.com", "b.ca"}, {"m.ca", "m.ba", "m.com"}};

        //jagged
        String[][] courses = new String[3][];
        courses[0]= new String[2];
        courses[1]= new String[4];
        courses[2]= new String[3];

        for (int i =0; i<courses.length;i++){
            courses[i]= new String[courses.length+1];
            System.out.println("size of row "+ i + " size "+ courses[i].length);
            System.out.println(Arrays.toString(courses[i]));
            for (int j = 0; j< courses[i].length; j++){
                System.out.print(courses[i][j]);
            }
            System.out.println();
        }
    }
}

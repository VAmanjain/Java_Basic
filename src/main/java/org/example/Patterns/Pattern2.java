package org.example.Patterns;

public class Pattern2 {
    public static void main(String[] args) {
int n = 5;
        System.out.println("Pattern 1 :");

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (i==j){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(" Pattern 2 :");

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (i==j || j == ((n-1)-i)){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(" Pattern 3 :");

        for (int i = 0; i < n ; i++ ){
            for (int j = 0; j <n ; j++){
                if (j==0 || j==n-1){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(" Pattern 4 :");

        for (int i = 0; i < n ; i++ ){
            for (int j = 0; j <n ; j++){
                if (j==n/2 || i==n/2 || i<n/2&&j==0|| i>n/2&&j==n-1){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(" Pattern 5 :");
        n=7;
        for (int i = 0; i <= n/2 ; i++ ){
            for (int j = 0; j <n ; j++){
                if (j==(n/2)-i || j==(n/2)+i|| i==n/2  ){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(" Pattern 6 :");
        n=10;
        for (int i = 0; i <= n ; i++ ){
            for (int j = 0; j <n ; j++){
                if (i==0 ||i==n|| j==n/2 || j==0 || j==n-1 || i==n/2 || i==j || j == ((n-1)-i) ){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }


    }

}

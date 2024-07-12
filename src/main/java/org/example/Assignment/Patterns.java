package org.example.Assignment;

public class Patterns {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" Pattern 1 :");
        int n=7;
        for (int i = 0; i < n ; i++ ){
            if (i < n - 1) {
                for (int j = 0; j <n ; j++){
                    if (j==0 || j== n-1  ){
                        System.out.print("*");
                    }
                    else System.out.print(" ");
                }
            }
            else {
                for (int j = 0; j <n ; j++){
                    if (j!=0 && j!= n-1  ){
                        System.out.print("*");
                    }
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(" Pattern 2 :");
        n=10;
        for (int i = 0; i < n ; i++ ){
            if (i <= n/3) {
                for (int j = 0; j <n ; j++){
                        System.out.print("*");
                }
            } else if (i>n/3 ) {
                for (int j = 0; j < 2; j++){
                    System.out.print("*");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(" Pattern 3 :");
        n=7;
        for (int i = 0; i<n; i++){
            for (int j=0; j<n;j++){
                if (j==n/2||i==n/2||j==n/2-i){
                System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(" Pattern 3 :");
        n=10;

        for (int i = 0; i<n-2; i++){
            for (int j=0; j<n;j++){
                if (j==(n-1)-i && j>=n/2-1 || i>=n/2-1 &&i==j+2  ){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(" Pattern 4 :");
        n=6;

        for(int i =0;i<=n;i++){
            for (int j =0;j<=n-2;j++){
                if (j==(n/2)-1&&i!=n-1||j>(n-1)/2&&i<(n/2)-1||i+j==n&&i>(2*n/3)||i-j==(n/2)-1&&i>(2*n/3)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(" Pattern 4 :");
         n = 3;
        int maxRowCol = n * 2 + 1; // 7
        int spaceCreate = n - 1; // 2
        int standIndex = maxRowCol - spaceCreate;
        int standStartIndex = 1;
        for(int i=0; i < maxRowCol; i++) {
            for (int j = 0; j < maxRowCol; j++) {
                if (j < spaceCreate) {
                    System.out.print(" ");
                } else {
                    /////
                    if (i < standIndex) {
                        if (j >= spaceCreate && i < spaceCreate || j == spaceCreate) {
                            System.out.print("*");
                        }
                    } else {

                        if( j==spaceCreate || j>= spaceCreate+standStartIndex || j<=spaceCreate-standStartIndex  )
                        {
                            System.out.print("*");
//                            standStartIndex++;
                        }
                        else System.out.print(" ");

                    }
                }
            }
            System.out.println();
        }
    }
}

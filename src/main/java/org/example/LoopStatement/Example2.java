package org.example.LoopStatement;

public class Example2 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};

        int n = 3;

        for (int i = 0 ; i < n ; i ++){
//            System.out.println(i);
            for (int j = 0 ; j < n ; j ++){
//                System.out.println(i+" with "+j);

                for (int k = 0; k  < n ; k++){
//                    System.out.println(i+" with "+j+" and " + k);
                    System.out.print(i+""+j+""+k+", ");
                }
                System.out.println();
            }
        }

        System.out.println("Lable loop : ");

       iLoop: for (int i = 0 ; i < n ; i ++){ // using lable loop => we can use or call loop using  lable of the loop
//            System.out.println(i);
          jLoop:  for (int j = 0 ; j < n ; j ++){
//                System.out.println(i+" with "+j);

                kLoop :for (int k = 0; k  < n ; k++){
//                    System.out.println(i+" with "+j+" and " + k);
                    if (k==1) continue jLoop;
                    System.out.print(i+""+j+""+k+", ");
                }
                System.out.println();
            }
        }
    }
}

package org.example.ControlStatment;

public class ControlStatment {
    public static  void main ( String []args){
        govtWeb();
        switchCase();
    }

    public static void govtWeb(){
//          Case1 : 18 > = && < = 30 ;
//          Case2 : 30 > && <= 35 && ex-exmployee
//          Case4 : 35 > && <= 40 && army

        int age = 36;
        String category = "ex-employee";

        if (age >= 18 && age <= 30){
            System.out.println("You are Qualify.");
        } else if (age > 30 && age <= 35 && category.equalsIgnoreCase("ex-employee") ) {
            System.out.println("You are Qualify.- ex-employee");
        } else if (age >= 35 && age <= 40 && category.equalsIgnoreCase("army")) {
            System.out.println("You are Qualify.- army");
        }
        else {
            System.out.println("You are not Qualify.");
        }

    }


    public static void govtWebTarnary(){
//          Case1 : 18 > = && < = 30 ;
//          Case2 : 30 > && <= 35 && ex-exmployee
//          Case4 : 35 > && <= 40 && army

        int age = 35;
        String category = "ex-employee";
        String IsQualify = null;


    }

    public static void switchCase(){
        int day = 1;

        switch (day){
            case 0 :
                System.out.println("Today is Sunday");
                break;
            case 1 :
                System.out.println("Today is Monday");
                break;
            case 2 :
                System.out.println("Today is Tuesday");
                break;
            default:
                System.out.println("Invalid Input");
        }

        // Switch with lembada

        switch (day){
            case 0 ->//lambda expression => allow not to use break keyword to stop switch case.
                System.out.println("Today is Sunday");
            case 1 ->
                System.out.println("Today is Monday");
            case 2 ->
                System.out.println("Today is Tuesday");
            default->
                System.out.println("Invalid Input");
        }
    }
}

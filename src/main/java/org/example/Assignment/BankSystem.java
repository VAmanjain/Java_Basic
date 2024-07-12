package org.example.Assignment;
import java.util.Scanner;

class Account{
    String userName = "Aman";
    int pin = 2314;
    int balance= 16000;
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account();
        int wrongPin = 0;
        int pin;
        mainLoop:while(wrongPin <3){
            System.out.print("Enter a pin :");
            pin = sc.nextInt();
            if (pin== account.pin){
                    boolean ch = true;
                    while (ch){
                        System.out.println("Press key according you want:-");
                        System.out.println("1-Deposit.");
                        System.out.println("2-Withdraw.");
                        int work = sc.nextInt();
                        switch (work){
                            case 1 ->{
                                System.out.println("Enter a amount of deposit: ");
                                int amount = sc.nextInt();
                                if (amount >= 100000){
                                    System.out.println("Can't deposit this amount. (Limit execeed)");
                                }
                                else {
                                    account.balance = account.balance+amount;
                                    System.out.println("Desposit Successfully.");
                                }
                            }
                            case 2-> {
                                System.out.println("Enter a amount of Withdraw: ");
                                int amount = sc.nextInt();
                                if (amount > 15000 || amount>account.balance){
                                    System.out.println("Can't withdraw this amount. (Limit execeed)");
                                }
                                else {
                                    account.balance = account.balance-amount;
                                    System.out.println("Withdraw Successfully.");
                                }
                            }
                            default -> {
                                System.out.println("Invalid input.");
                            }
                        }
                        System.out.print("Do you want to continue? (if yes then press y key ):");
                        String ans = sc.next();
                        if (ans.equalsIgnoreCase("y")){
                            ch=true;
                        }
                        else {
                            ch = false;
                            System.out.println("Thanks for coming..");
                            break mainLoop;
                        }
                    }
            }
            else{
                System.out.println("Enter valid input.");
                wrongPin++;
            }

        }
        if (wrongPin==3){
            System.out.println("Chance of entering pin is over. Try Again........" );
        }
    }
}

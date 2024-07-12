package org.example.OOPs.Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
     Account account = new Account();
        System.out.println(account.getBalance());
     User user = new User();
     user.setId(123);
        System.out.println(user.getId());

        int a = 10;
        Integer b = a;//autoboxing =>assigning primitive data into  class object.
    }
}

package org.example.OOPs.OopsExample;

/*
* 1.default
* 2.Parameterized
* */

// We can create Private constructor when we made single tern class.

public class Parent {

    {
        System.out.println("As parent class block Statment ."); // block statment priority is greator than constructor.
    }

    int id =10;
    String name = "aman";

    //Default Constructor.
    Parent(){
        System.out.println("As parent class Constructor.");
    }

    // setter and getter => methods to use assign values into class instance variable.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

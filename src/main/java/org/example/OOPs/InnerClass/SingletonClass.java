package org.example.OOPs.InnerClass;

public class SingletonClass {

//    final SingletonClass singletonClass =null;

    private static SingletonClass singletonClass;
    private SingletonClass(){

    }

    public static SingletonClass getSingletonClass (){
        if (singletonClass == null){
            singletonClass = new SingletonClass();

        }
        return  singletonClass;
    }
}

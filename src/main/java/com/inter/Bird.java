package com.inter;

public class Bird  extends Animal implements flyable{
    public Bird(){
        super("Bird",2);
    }

    public void fly(){
        System.out.println("I can fly with wings");
    }

    public void eat(){
        System.out.println("I can eat");
    }

}

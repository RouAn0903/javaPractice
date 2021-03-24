package com.inter;

public class Airplane implements flyable{
    @Override
    public void fly() {
        System.out.println("I can fly with engines");
    }
}

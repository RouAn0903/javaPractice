package com.exam1;

public class Box1 extends Box{
    Box1(){
        length=5;
        width=10;
        height=10;
    }

    @Override
    public String getName() {
        return "Box1";
    }

    @Override
    public String getPrice() {
        return "40 dollars";
    }
}

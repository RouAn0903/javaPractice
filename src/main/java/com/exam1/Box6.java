package com.exam1;

public class Box6 extends Box{
    Box6(){
        length=20;
        width=20;
        height=20;
    }

    @Override
    public String getName() {
        return "Box6";
    }

    @Override
    public String getPrice() {
        return "90 dollars";
    }
}

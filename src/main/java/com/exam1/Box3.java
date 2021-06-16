package com.exam1;

public class Box3 extends Box{
    Box3(){
        length=15;
        width=10;
        height=10;
    }

    @Override
    public String getName() {
        return "Box3";
    }

    @Override
    public String getPrice() {
        return "60 dollars";
    }
}

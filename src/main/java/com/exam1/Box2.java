package com.exam1;

public class Box2 extends Box{
    Box2(){
        length=10;
        width=10;
        height=10;
    }

    @Override
    public String getName() {
        return "Box2";
    }

    @Override
    public String getPrice() {
        return "50 dollars";
    }
}

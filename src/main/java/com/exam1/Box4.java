package com.exam1;

public class Box4 extends Box{
    Box4(){
        length=15;
        width=15;
        height=15;
    }

    @Override
    public String getName() {
        return "Box4";
    }

    @Override
    public String getPrice() {
        return "70 dollars";
    }
}

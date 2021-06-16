package com.exam1;

public class Box5 extends Box{
    Box5(){
        length=15;
        width=15;
        height=15;
    }

    @Override
    public String getName() {
        return "Box5";
    }

    @Override
    public String getPrice() {
        return "80 dollars";
    }
}

package com.box;

public class Box3 extends Box{
    public Box3(){
        length =10;
        width =15;
        height =15;
    }

    @Override
    public String getName() {
        return "Box3";
    }

    public int getPrice(){
        return 60;
    }
}

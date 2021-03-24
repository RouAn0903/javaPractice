package com.box;

public class Box3 {
    int length=5;
    int width=10;
    int height=5;

    public Box3(){

    };
    public Box3(int length, int width, int height){
        this.length=length;
        this.width=width;
        this.height=height;
    }

    public void print(){
        System.out.println(length+"\t"+width+"\t"+height);
    }

}

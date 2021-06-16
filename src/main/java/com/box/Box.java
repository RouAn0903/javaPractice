package com.box;

public abstract class Box {
        int length;
        int height;
        int width;

    public boolean validate(int l, int h, int w){
        return (l<=length && h<=height && w<=width);
    }
    public abstract String getName();
}

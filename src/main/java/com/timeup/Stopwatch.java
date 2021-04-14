package com.timeup;

public class Stopwatch {
    public static void main(String[] args) throws Exception{
        watchUser w = new watchUser();
        Timer.startTimer(5,w);
    }

}

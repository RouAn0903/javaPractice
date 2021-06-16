package com.thread.Race;

public class HorseRunable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("RR "+i);
        }
        System.out.println(Thread.currentThread());
    }
}

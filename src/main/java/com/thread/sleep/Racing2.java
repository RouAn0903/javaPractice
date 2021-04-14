package com.thread.sleep;

public class Racing2 {
    public static void main(String[] args) {
        Horse2 h1 = new Horse2();
        Horse2 h2 = new Horse2();
        Horse2 h3 = new Horse2();
        h1.setName("h1");
        h2.setName("h2");
        h3.setName("h3");
        h1.start();
        h2.start();
        h3.start();
        try{
            h1.join();
            h2.join();
            h3.join();
        }catch (InterruptedException e){
            System.out.println("Interruption !!!");
        }
        System.out.println("Racing is over");
    }

}

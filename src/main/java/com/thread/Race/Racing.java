package com.thread.Race;

public class Racing {
    public static void main(String[] args) {
        String h1 = "Horse1";
        Horse h2 = new Horse();
        h2.start();
        HorseRunable h3 = new HorseRunable();
        Thread tr = new Thread(h3);
        System.out.println();
        tr.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(h1+" "+i);

        }
    }
}

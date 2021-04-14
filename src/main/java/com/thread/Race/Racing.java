package com.thread.Race;

public class Racing {
    public static void main(String[] args) {
        String h1 = "Horse1";
        Horse h2 = new Horse();
        h2.start();
        HorseRunable h3 = new HorseRunable();
        Thread thread = new Thread(h3);
        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(h1+" "+i);

        }
    }
}

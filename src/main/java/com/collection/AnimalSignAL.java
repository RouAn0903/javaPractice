package com.collection;

import java.util.ArrayList;

public class AnimalSignAL {
    public static void main(String[] args) {
        char[] animals = {'A','C','D','G'};
        ArrayList<Character> seven = new ArrayList<>();
        for (int i = 0; i<animals.length ; i++) {
            seven.add(animals[i]);
        }
        System.out.println("seven.size: "+seven.size());
        System.out.println("seven: "+seven);

        seven.add(1,'B');
        seven.add(4,'E');
        seven.add(5,'F');

        System.out.println("\t seven.size: "+seven.size());
        System.out.print("seven:");
        for (int i = 0; i < seven.size() ; i++) {
            System.out.print(seven.get(i)+" ");
        }

    }
}

package com.collection;

import java.util.TreeSet;

public class IntTree {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 1; i <= 10; i++) {
            ts.add(i*10);
        }
        System.out.println("ts.size: "+ts.size());
        TreeSet subts = (TreeSet) ts.headSet(50);
        System.out.println("subts.size: "+subts.size());
        subts.clear();

        System.out.println("remove subts, ts.size: "+ts.size());
    }
}

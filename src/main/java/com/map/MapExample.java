package com.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        LinkedHashMap lm = new LinkedHashMap();

        lm.put(20,"B");
        lm.put(30,"A");
        lm.put(10,"C");
        System.out.println(lm);

        lm.put(30,"a");
        lm.put(40,"D");
        System.out.println("Change: \n"+lm);

        lm.remove(30);
        System.out.println("Remove: \n"+lm);

        System.out.println("ContainsValue(10): \n"+lm.containsValue(10));

        Set ks = lm.keySet();
        System.out.println("KeySet: "+ks);
        Collection vlu = lm.values();
        System.out.println("Value: "+ vlu);
        Set es = lm.entrySet();
        System.out.println("EntrySet: "+es);

       lm.forEach((k,v) -> System.out.println(k+" = "+v));

    }
}

package com.set;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set ls = new LinkedHashSet();

        ls.add("3rd");
        ls.add(1);
        ls.add("2nd");
        ls.add(new Integer(4));
        System.out.println(ls);

        ls.add("2nd");
        ls.add(1);
        System.out.println("Add same value(2nd,1) in LinkedHashSet: ");
        System.out.println(ls);

        ls.remove("2nd");
        System.out.println("Remove value(2nd) from LinkedHashSet: ");
        System.out.println(ls);

        System.out.println("Check value(3rd) in LinkedHashSet: "+ls.contains("3rd"));

        Iterator i = ls.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}

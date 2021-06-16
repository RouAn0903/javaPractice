package com.set;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayListExample {
    public static void main(String[] args) {
       LinkedList al = new LinkedList();

       al.add("3rd");
       al.add(2);
       al.add(new Integer(4));
       al.add(1);
       System.out.println(al);

       al.remove(2);
       System.out.println("Remove value(2) in ArrayList: ");
       System.out.println(al);

       al.add(2,"3rd");
       al.add(new Integer(5));
       System.out.println("Add value(3rd,5) in ArrayList: ");
       System.out.println(al);

       System.out.println("Check indexOf(2) -> "+al.indexOf(2));
       System.out.println("Check get(4) -> "+al.get(4));

       ListIterator i = al.listIterator();
       while(i.hasNext()){
           System.out.println(i.nextIndex()+" = "+i.next()+"\t");
       }

    }
}

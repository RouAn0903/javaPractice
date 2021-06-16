package com.map;

import java.util.LinkedList;
import java.util.Queue;

public class QueExample {
    public static void main(String[] args) {
        Queue q = new LinkedList();
        q.offer("Three");
        q.offer("Two");
        q.offer("One");
        System.out.println(q);

        System.out.println("Take beginning value, remove beginning value: \t"+q.poll());
        System.out.println(q);
        System.out.println("Take beginning value, not remove beginning value: \t"+q.peek());
        System.out.println(q);

        q.add("Three");
        System.out.println(q);
        q.remove();
        System.out.println(q);
    }
}

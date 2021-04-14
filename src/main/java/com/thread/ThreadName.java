package com.thread;

public class ThreadName {
    public static void main(String[] args) {
        Thread thr = Thread.currentThread();
        System.out.println("Current thread name: " +thr.getName());
        thr.setName("demo");
        System.out.println("Change thread name: " +thr.getName());
    }
}

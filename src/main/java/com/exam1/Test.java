package com.exam1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Box1 b1 = new Box1();
        Box2 b2 = new Box2();
        Box3 b3 = new Box3();
        Box4 b4 = new Box4();
        Box5 b5 = new Box5();
        Box6 b6 = new Box6();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter object's LENGTH:");
        int length= sc.nextInt();
        System.out.println("Please enter object's WIDTH:");
        int width=sc.nextInt();
        System.out.println("Please enter object's HEIGHT:");
        int height=sc.nextInt();

        if(b1.validate(length, width, height)){
            System.out.println(b1.getName()+" , "+b1.getPrice());
        }else if(b2.validate(length, width, height)){
            System.out.println(b2.getName()+" , "+b2.getPrice());
        }else if(b3.validate(length, width, height)){
            System.out.println(b3.getName()+" , "+b3.getPrice());
        }else if(b4.validate(length, width, height)){
            System.out.println(b4.getName()+" , "+b4.getPrice());
        }else if(b5.validate(length, width,height)){
            System.out.println(b5.getName()+" , "+b5.getPrice());
        }else if(b6.validate(length, width, height)){
            System.out.println(b6.getName()+" , "+b6.getPrice());
        }

    }
}

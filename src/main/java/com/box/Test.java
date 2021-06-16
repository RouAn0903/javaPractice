package com.box;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Box3 b3 = new Box3();
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter box length");
        int length = sc.nextInt();
        System.out.println("Please enter box width");
        int width = sc.nextInt();
        System.out.println("Please enter box height");
        int height = sc.nextInt();

        if(b3.validate(length, width,height)){
            System.out.println(b3.getName()+" "+b3.getPrice());
        }else{
            System.out.println("Unsuitable");
        }

        /*
        if(length <=10 && width<=15 && height <=15){
            System.out.println("Box3");
        }else if(length<=15 && width<=20 && height<=20){
            System.out.println("Box5");
        }

         */
    }
}

package com.ch14;

import java.io.*;
import java.nio.Buffer;


public class CatchException {
    public static void main(String[] args) throws IOException{
        int[] secret = {123,456,789};
        System.out.println("There are three secret numbers, which one do you want to see?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int target =0;

        try{
            target=Integer.parseInt(str);
            System.out.println("No. "+target+" secret number is "+secret[target-1]);
        }catch (ArrayIndexOutOfBoundsException | NumberFormatException e){
            System.out.println("Wrong input number");
            System.out.println("Please check you number is between 1-3");
        }
        System.out.println("Welcome to use it again");
    }

}

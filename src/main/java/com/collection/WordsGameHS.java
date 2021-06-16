package com.collection;

import java.util.HashSet;
import java.util.Scanner;

public class WordsGameHS {
    public static void main(String[] args) {
        System.out.println("Words solitaire game, words cannot repeat ");
        System.out.println("Please enter first word: ");
        Scanner sc = new Scanner(System.in);
        String s =sc.next();

        HashSet<String> words = new HashSet<>();

        while (true){
            System.out.println("Enter next word: ");
            sc.next();
            if(!words.add(s)){
                System.out.println("Failed! This word had appeared");
                break;
            }
        }
        System.out.println("\nThe words: "+words);
    }
}

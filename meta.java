package com.java;

import java.util.Scanner;

public class meta {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String[] letters={"a","b","c","d","e"};
        String search="a";
        Count(letters, search);
    }

    private static void Count(String[] letters, String search) {
        int count=0;
        for (String letter:letters){
            System.out.println(letter);
            if (letter==search){
                count++;
            }
        }
        System.out.println(count);
    }
}

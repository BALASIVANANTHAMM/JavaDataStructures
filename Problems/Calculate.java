package com.java;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sum =0;
        int digit;
        while (n>0){
            digit = n % 10;
            sum +=digit;
            n/=10;
        }
        System.out.println(sum);
    }
}

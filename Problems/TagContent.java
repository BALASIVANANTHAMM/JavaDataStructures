package com.java;

import java.util.*;
import java.util.regex.*;

public class Tag{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Pattern p=Pattern.compile("<([^>]+)>([^<]+)</\\1>");
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            Matcher matcher=p.matcher(line);
            int m=0;
            while(matcher.find()){
                m++;
                System.out.println(matcher.group(2));
            }
            if(m==0){
                System.out.println("None");
            }


            //Write your code here

            testCases--;
        }
    }
}





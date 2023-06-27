package com.java;
import java.util.Scanner;

public class Arr
{
    static boolean isAnagram(String str1, String str2)
    {
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        int sa=0,sb=0;
        boolean status=true;
        for (char i='a';i<='z';i++){
            sa=0;
            for (int i1=0;i1<str1.length();i1++){
                if (str1.charAt(i1) == i){
                    sa++;
                }
            }
            sb=0;
            for (int i2=0;i2<str2.length();i2++){
               if (str2.charAt(i2) == i){
                   sb++;
               }
            }
            if (sa == sb){
                status=true;
            }else {
                status=false;
                break;
            }
        }
        return status;


    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        String str1=scan.nextLine();
        String str2=scan.nextLine();
        boolean ret=isAnagram(str1,str2);
        System.out.println((ret) ? "Anagrams" : "Not an Anagrams");
    }
}

package com.deloitte.lab3.ex3;
import java.util.*;
public class Lab3Ex3 {
    public static String alterString(String input){
        String st="";
        StringBuilder sb = new StringBuilder(st);
        char[] carray= input.toCharArray();
        String result;
        for(char ch:carray){
            if( ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                sb.append(ch);
            }
            else{
                 sb.append((char)(ch+1));
            }
        }
        String res = sb.toString();
        return res;
    }
    public static void main(String[] args){
          System.out.println("Enter the String");
          Scanner sc = new Scanner(System.in);
          String s;
          s=sc.nextLine();
          System.out.println("The result is "+alterString(s));
    }
}

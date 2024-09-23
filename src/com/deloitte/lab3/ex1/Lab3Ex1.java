package com.deloitte.lab3.ex1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab3Ex1 {
    public static void main(String[] args){
        System.out.println("Enter the line of integers");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum=0;
        StringTokenizer tokenizer = new StringTokenizer(s);
        while(tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            int number = Integer.parseInt(token);
            sum+=number;
        }
        System.out.println("The sum of the numbers is "+sum);

    }
}

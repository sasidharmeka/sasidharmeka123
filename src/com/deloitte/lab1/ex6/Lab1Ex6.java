package com.deloitte.lab1.ex6;

import java.util.Scanner;

public class Lab1Ex6 {

    public static int calculateDifference(int n) {

        int s1=0;

        for(int i=1;n>=i;i++) {

            s1+=Math.pow(i,2);

        }

        int s2=0;

        for(int j=0;n>=j;j++) {

            s2+=j;

        }

        int s3=0;

        s3+=Math.pow(s2,2);

        int Sum;

        Sum=s3-s1;

        return Sum;

    }



    public static void main(String[] args) {

        System.out.println("Enter the value of n");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result;

        result = calculateDifference(n);

        System.out.println("The result of Square of Sum - Sum of Squares: "+result);

        sc.close();

    }

}



package com.deloitte.lab1.ex5;

import java.util.Scanner;

public class Lab1Ex5 {


    public static int calculateSum(int n) {

        int sum = 0;

        if (n >= 3) {

            for (int i = 3; i <= n; i++) {

                if (i % 3 == 0 | i % 5 == 0) {

                    sum += i;

                }


            }

        }

        return sum;

    }


    public static void main(String[] args) {


        System.out.println("Enter the value of n");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("The result is " + calculateSum(n));

        sc.close();

    }
}

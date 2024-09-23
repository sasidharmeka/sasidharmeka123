package com.deloitte.lab1.ex7;

import java.util.Scanner;

public class Lab1Ex7 {

    public static boolean checkNumber(int number) {

        int n1;

        int n2;

        while (number > 0) {

            n1 = number % 10;

            number = number / 10;

            n2 = number % 10;

            if (n2 > n1) {

                return false;

            }

        }

        return true;

    }

    public static void main(String[] args) {

        System.out.println("Enter the value of n");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (checkNumber(n) == true) {

            System.out.println("It is an increasing number");

        } else {

            System.out.println("It is not  an increasing number");

        }

    }
}



package com.deloitte.lab1.ex8;

import java.util.Scanner;

public class Lab1Ex8 {

    public static boolean checkNumber(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        if (checkNumber(number)) {
            System.out.println(number + " is a power of 2.");
        } else {
            System.out.println(number + " is not a power of 2.");
        }
        sc.close();
    }
}

package com.deloitte.lab9.ex5;

import java.util.Scanner;

public class Lab9Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        Factorial factorial = Lab9Ex5::calculateFactorial;
        long result = factorial.compute(number);

        System.out.println("Factorial of " + number + " is: " + result);

        scanner.close();
    }

    public static long calculateFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    @FunctionalInterface
    interface Factorial {
        long compute(int n);
    }
}


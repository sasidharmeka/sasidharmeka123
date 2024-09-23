package com.deloitte.lab1.ex3;

import java.util.Scanner;

public class Lab1Ex3 {


    public static int Fibonacci(int n) {

        if (n == 0) {

            return 0;

        }


        if (n == 1) {

            return 1;

        }


        if (n == 2) {

            return 1;

        } else {

            return Fibonacci(n - 1) + Fibonacci(n - 2);

        }

    }

    public static void main(String[] args) {

        System.out.println("Non Recursive");

        System.out.println("Enter the value of n");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 1) {

            System.out.println("The nth Fibonacci number is 1");

        } else if (n == 0) {

            System.out.println("The nth Fibonacci number is 0");

        } else {

            int fib1 = 0, fib2 = 1;

            int fib = 1;

            for (int i = 2; i <= n; i++) {

                fib = fib1 + fib2;

                fib1 = fib2;

                fib2 = fib;

            }

            System.out.println("The nth Fibonacci number is " + fib);

        }


        System.out.println("Recursive");

        System.out.println("Enter the value of n");

        Scanner sc1 = new Scanner(System.in);

        int num = sc1.nextInt();

        System.out.println("The nth Fibonacci number is " + Lab1Ex3.Fibonacci(num));

        sc.close();

        sc1.close();
    }
}

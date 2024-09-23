package com.deloitte.lab9.ex1;

import java.util.Scanner;

public class Lab9Ex1{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter first number (x): ");
        double x = scanner.nextDouble();

        System.out.println("Enter second number (y): ");
        double y = scanner.nextDouble();


        ProductCalculator productCalculator = (a, b) -> a * b;


        double result = productCalculator.calculate(x, y);
        System.out.println("The product of " + x + " and " + y + " is: " + result);


        scanner.close();
    }


    @FunctionalInterface
    interface ProductCalculator {
        double calculate(double a, double b);
    }
}

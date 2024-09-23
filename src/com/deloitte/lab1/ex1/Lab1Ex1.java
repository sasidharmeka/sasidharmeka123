package com.deloitte.lab1.ex1;

import java.util.Scanner;

public class Lab1Ex1 {



    public static int sumOfDigits(int number) {

        int sum = 0;

        while (number != 0) {

            int digit = number % 10;  // Get the last digit

            sum += Math.pow(digit, 3);  // Cube the digit and add to sum

            number /= 10;  // Remove the last digit

        }

        return sum;

    }





    public static void main(String[] args) {

        System.out.println("Enter a number");

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int result = sumOfDigits(number);

        System.out.println("The sum of cubes of digits in " + number + " is: " + result);

        sc.close();

    }

}
package com.deloitte.lab6.ex3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab6Ex3 {

    // Method to return the numbers and their squares in a HashMap
    public static Map<Integer, Integer> getSquares(int[] numbers) {
        // Create a HashMap to store numbers and their squares
        Map<Integer, Integer> squaresMap = new HashMap<>();

        // Loop through the array
        for (int number : numbers) {
            // Calculate the square of the number
            int square = number * number;

            // Add the number and its square to the HashMap
            squaresMap.put(number, square);
        }

        // Return the HashMap with the numbers and their squares
        return squaresMap;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the number of elements:");


        int n = sc.nextInt();

        // Create an array to store the numbers
        int[] numbers = new int[n];


        System.out.println("Enter the numbers:");


        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }


        Map<Integer, Integer> squares = getSquares(numbers);


        System.out.println("Numbers and their squares: " + squares);


        sc.close();
    }
}


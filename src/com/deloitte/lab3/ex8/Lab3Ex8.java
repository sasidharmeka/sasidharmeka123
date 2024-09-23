package com.deloitte.lab3.ex8;

import java.util.Scanner;

public class Lab3Ex8 {

    // Method to check if the string is positive
    public static boolean isPositiveString(String str) {
        // Convert the string to uppercase for case-insensitive comparison
        str = str.toUpperCase();

        // Loop through the string and compare each character with the previous one
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) < str.charAt(i - 1)) {
                return false;  // Return false if the current character is not greater
            }
        }
        return true;  // Return true if all characters are in increasing order
    }

    public static void main(String[] args) {
        // Create a Scanner to read input
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter a string:");
        String input = sc.next();

        // Check if the string is positive and display the result
        if (isPositiveString(input)) {
            System.out.println(input + " is a positive string.");
        } else {
            System.out.println(input + " is not a positive string.");
        }

        // Close the scanner to avoid resource leaks
        sc.close();
    }
}


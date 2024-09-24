package com.deloitte.lab3.ex4;

import java.util.Scanner;

public class Lab3Ex4 {

    // Method to modify the number
    public static int modifyNumber(int input) {
        // Convert the number to a string
        String str = Integer.toString(input);
        StringBuilder sb = new StringBuilder(); // No need to pass an empty string

        // Loop through the string, stopping before the last digit
        for (int i = 0; i < str.length() - 1; i++) {
            // Get consecutive digits
            int n1 = str.charAt(i) - '0';     // Convert char to integer
            int n2 = str.charAt(i + 1) - '0'; // Convert char to integer

            // Find the absolute difference between consecutive digits
            int diff = Math.abs(n1 - n2);

            // Append the difference to the StringBuilder
            sb.append(diff);
        }

        // Append the last digit as it is (as a number, not a character)
        sb.append(str.charAt(str.length() - 1)); // Convert last character to integer

        // Convert the resulting string back to an integer
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        // Create a Scanner to read input
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        // Output the modified number
        System.out.println("The result is: " + modifyNumber(n));

        // Close the scanner to avoid resource leaks
        sc.close();
    }
}

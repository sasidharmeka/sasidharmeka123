package com.deloitte.lab6.ageexception;

import java.util.Scanner;

public class Lab5Ex1 {

    // Custom exception class defined inside the main class
    static class AgeException extends Exception {
        // Constructor to pass the exception message
        public AgeException(String message) {
            super(message);
        }
    }

    // Method to validate age
    public static void validateAge(int age) throws AgeException {
        // Check if the age is below or equal to 15
        if (age <= 15) {
            // Throw the custom exception if age is not valid
            throw new AgeException("Age must be above 15 to proceed.");
        } else {
            System.out.println("Age is valid. You are " + age + " years old.");
        }
    }

    public static void main(String[] args) {
        // Create a Scanner to read input
        Scanner sc = new Scanner(System.in);

        // Ask for user's age
        System.out.println("Enter your age:");

        // Read the age input
        int age = sc.nextInt();

        try {
            // Call the method to validate the age
            validateAge(age);
        } catch (AgeException e) {
            // Handle the custom exception and print the message
            System.out.println(e.getMessage());
        } finally {
            // Close the scanner
            sc.close();
        }
    }
}

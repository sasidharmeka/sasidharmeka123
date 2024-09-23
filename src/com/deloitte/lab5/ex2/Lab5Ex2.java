package com.deloitte.lab5.ex2;

import java.util.Scanner;

public class Lab5Ex2 {

    // Custom exception class defined inside the main class
    static class InvalidNameException extends Exception {
        // Constructor to pass the exception message
        public InvalidNameException(String message) {
            super(message);
        }
    }

    // Method to validate the employee's full name
    public static void validateFullName(String firstName, String lastName) throws InvalidNameException {
        // Check if firstName or lastName is blank
        if (firstName.isBlank() || lastName.isBlank()) {
            throw new InvalidNameException("First name and last name must not be blank.");
        } else {
            System.out.println("Full name is valid: " + firstName + " " + lastName);
        }
    }

    public static void main(String[] args) {
        // Create a Scanner to read input
        Scanner sc = new Scanner(System.in);

        // Ask for employee's first name
        System.out.println("Enter first name:");
        String firstName = sc.nextLine().trim(); // trim() to remove any leading/trailing spaces

        // Ask for employee's last name
        System.out.println("Enter last name:");
        String lastName = sc.nextLine().trim(); // trim() to remove any leading/trailing spaces

        try {
            // Call the method to validate the full name
            validateFullName(firstName, lastName);
        } catch (InvalidNameException e) {
            // Handle the custom exception and print the message
            System.out.println(e.getMessage());
        } finally {
            // Close the scanner to avoid resource leaks
            sc.close();
        }
    }
}

package com.deloitte.lab3.ex9;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Lab3Ex9 {

    // Method to calculate the duration between input date and current system date
    public static void printDuration(String inputDate) {
        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Parse the input date
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // Get the current system date
        LocalDate currentDate = LocalDate.now();

        // Calculate the period between the two dates
        Period period = Period.between(date, currentDate);

        // Extract years, months, and days from the period
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        // Print the duration
        System.out.println("The duration is: ");
        System.out.println(years + " years, " + months + " months, and " + days + " days.");
    }

    public static void main(String[] args) {
        // Create a Scanner to read input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a date in the format dd/MM/yyyy
        System.out.println("Enter the date (dd/MM/yyyy): ");
        String inputDate = sc.next();

        // Call the method to calculate and print the duration
        printDuration(inputDate);

        // Close the scanner to avoid resource leaks
        sc.close();
    }
}


package com.deloitte.lab6.ex4;



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab6Ex4 {

    // Method to return students eligible for medals
    public static Map<Integer, String> getStudents(Map<Integer, Integer> studentMarks) {
        // Create a HashMap to store student registration numbers and their medals
        Map<Integer, String> studentMedals = new HashMap<>();

        // Iterate through the HashMap of student marks
        for (Map.Entry<Integer, Integer> entry : studentMarks.entrySet()) {
            int regNo = entry.getKey();
            int marks = entry.getValue();

            // Determine the medal type based on marks
            if (marks >= 90) {
                studentMedals.put(regNo, "Gold");
            } else if (marks >= 80 && marks < 90) {
                studentMedals.put(regNo, "Silver");
            } else if (marks >= 70 && marks < 80) {
                studentMedals.put(regNo, "Bronze");
            }
        }

        // Return the HashMap with registration numbers and medal types
        return studentMedals;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Create a HashMap to store student registration numbers and marks
        Map<Integer, Integer> studentMarks = new HashMap<>();

        // Prompt the user to input the number of students
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();

        // Loop to take registration numbers and marks from the user
        for (int i = 0; i < n; i++) {
            System.out.println("Enter registration number of student " + (i + 1) + ":");
            int regNo = sc.nextInt();

            System.out.println("Enter marks of student " + (i + 1) + ":");
            int marks = sc.nextInt();

            // Add the registration number and marks to the HashMap
            studentMarks.put(regNo, marks);
        }

        // Call the method to get the students eligible for medals
        Map<Integer, String> result = getStudents(studentMarks);

        // Print the registration numbers and their corresponding medal types
        System.out.println("Students and their medals: " + result);

        // Close the scanner to avoid resource leaks
        sc.close();
    }
}

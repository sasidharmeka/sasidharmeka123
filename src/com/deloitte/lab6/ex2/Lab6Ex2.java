package com.deloitte.lab6.ex2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab6Ex2 {

    // Method to count occurrences of each character in the array
    public static Map<Character, Integer> countChars(char[] arr) {
        // Create a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Loop through the array
        for (char c : arr) {
            // If character is already in the map, increase its count
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // Otherwise, add the character with a count of 1
                charCountMap.put(c, 1);
            }
        }

        // Return the map with character counts
        return charCountMap;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to input a string
        System.out.println("Enter a string:");

        // Read the input string from the user
        String input = sc.nextLine();

        // Convert the input string to a character array
        char[] charArray = input.toCharArray();

        // Call the method to count characters
        Map<Character, Integer> result = countChars(charArray);

        // Print the character counts
        System.out.println("Character counts: " + result);

        // Close the scanner to avoid resource leaks
        sc.close();
    }
}

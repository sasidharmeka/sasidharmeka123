package com.deloitte.lab2.ex2;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2Ex2 {

    public static String[] sortStrings(String[] arr) {
        // Step 1: Sort the array in alphabetical order
        Arrays.sort(arr);

        // Step 2: Determine the midpoint
        int mid;
        if ((arr.length % 2 == 0) )
        { mid=arr.length / 2 ;}
        else
        {mid=(arr.length / 2) + 1;}

        // Step 3: Convert the left half to uppercase
        for (int i = 0; i < mid; i++) {
            arr[i] = arr[i].toUpperCase();
        }

        // Step 4: Convert the right half to lowercase
        for (int i = mid; i < arr.length; i++) {
            arr[i] = arr[i].toLowerCase();
        }

        return arr;  // Return the modified array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the number of strings
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        // Accept the strings from the user
        String[] userStrings = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            userStrings[i] = scanner.nextLine();
        }

        // Call the sortStrings method and store the result
        String[] result = sortStrings(userStrings);

        // Print the sorted and formatted array
        System.out.println("Sorted and formatted strings:");
        for (String str : result) {
            System.out.println(str);
        }

        scanner.close();
    }
}

package com.deloitte.lab2.ex3;
import java.util.Arrays;
import java.util.Scanner;

public class Lab2Ex3 {

    // Method to reverse and sort the array
    public static int[] getSorted(int[] arr) {
        // Reverse the array using String conversion
        for (int i = 0; i < arr.length; i++) {
            String strNum = String.valueOf(arr[i]);
            String reversedStrNum = new StringBuilder(strNum).reverse().toString();
            arr[i] = Integer.parseInt(reversedStrNum);
        }

        // Sort the array
        Arrays.sort(arr);

        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting the number of elements in the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        // Accepting the elements of the array
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Getting the sorted array after reversing
        int[] sortedArray = getSorted(numbers);

        // Display the sorted array
        System.out.println("Sorted array after reversing: " + Arrays.toString(sortedArray));

        scanner.close();
    }
}

package com.deloitte.lab6.ex7;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Lab6Ex7 {

    public static Integer[] getSorted(int[] arr) {
        // Convert the integer array to an Integer array for sorting
        Integer[] reversedArray = new Integer[arr.length];

        // Reverse the numbers and store them in the new array
        for (int i = 0; i < arr.length; i++) {
            // Convert number to string, reverse it, and convert back to integer
            String reversedString = new StringBuilder(String.valueOf(arr[i])).reverse().toString();
            reversedArray[i] = Integer.parseInt(reversedString);
        }

        // Sort the reversed array
        Arrays.sort(reversedArray, Collections.reverseOrder());

        return reversedArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Integer[] sortedReversedArray = getSorted(arr);
        System.out.println("Resulting array after reversing and sorting:");
        System.out.println(Arrays.toString(sortedReversedArray));

        sc.close();
    }
}

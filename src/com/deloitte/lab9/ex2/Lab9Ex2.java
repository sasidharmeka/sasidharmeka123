package com.deloitte.lab9.ex2;
import java.util.Scanner;

public class Lab9Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        StringFormatter formatter = str -> {
            StringBuilder result = new StringBuilder();
            for (char ch : str.toCharArray()) {
                result.append(ch).append(" ");
            }
            return result.toString().trim();
        };

        String formattedString = formatter.format(input);
        System.out.println("Formatted string: " + formattedString);

        scanner.close();
    }

    @FunctionalInterface
    interface StringFormatter {
        String format(String str);
    }
}


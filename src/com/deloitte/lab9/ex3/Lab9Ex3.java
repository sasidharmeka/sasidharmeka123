package com.deloitte.lab9.ex3;

import java.util.Scanner;

public class Lab9Ex3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username = scanner.nextLine();

        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        Authenticator authenticator = (user, pass) ->
                user.equals("admin") && pass.equals("password123");

        boolean isAuthenticated = authenticator.authenticate(username, password);
        System.out.println("Authentication successful: " + isAuthenticated);

        scanner.close();
    }

    @FunctionalInterface
    interface Authenticator {
        boolean authenticate(String username, String password);
    }
}


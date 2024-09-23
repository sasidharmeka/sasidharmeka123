package com.deloitte.lab1.ex2;

import java.util.Scanner;

public class Lab1Ex2 {

    public static void main(String[] args) {

        System.out.println("Enter your choice");

        System.out.println("3 for Red");

        System.out.println("2 for Yellow");

        System.out.println("1 for Green");

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();

        switch(r) {

            case 1:System.out.println("Go");

                break;

            case 2:System.out.println("Ready");

                break;

            case 3:System.out.println("Stop");

                break;

            default:System.out.println("Invalid");

                break;

        }

        sc.close();

    }

}

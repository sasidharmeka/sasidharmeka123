package com.deloitte.lab1.ex4;

import java.util.Scanner;

public class Lab1Ex4 {

    public static boolean isPrime(int n) {

        if(n<=1) {

            return false;

        }

        else {

            for(int i=2;i<=(n/2);i++) {

                if((n%i)==0) {

                    return false;

                }



            }

            return true;

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer");

        int n = sc.nextInt();

        for(int i = 1;i<n;i++) {

            if (isPrime(i)==true) {

                System.out.println(i);

            }

        }

        sc.close();

    }

}

package com.deloitte.lab6.ex6;

import java.util.*;

public class Lab6Ex6 {

    public static List<Integer> votersList(Map<Integer, Integer> people) {
        List<Integer> eligibleVoters = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : people.entrySet()) {
            int id = entry.getKey();
            int age = entry.getValue();
            if (age > 18) {
                eligibleVoters.add(id);
            }
        }
        return eligibleVoters;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> people = new HashMap<>();

        System.out.println("Enter the number of people:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter ID of person " + (i + 1) + ":");
            int id = sc.nextInt();
            System.out.println("Enter age of person " + (i + 1) + ":");
            int age = sc.nextInt();
            people.put(id, age);
        }

        List<Integer> eligibleVoters = votersList(people);
        System.out.println("Eligible Voter IDs: " + eligibleVoters);

        sc.close();
    }
}

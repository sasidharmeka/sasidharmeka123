package com.deloitte.lab6.ex5;



import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Lab6Ex5 {
    public static int getSecondSmallest(List<Integer> list){
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;

        for(int num:list){
            if(num<smallest){
                secondSmallest=smallest;
                smallest=num;

            }
            else{
                if(num>smallest && num<secondSmallest){
                    secondSmallest=num;
                }
            }

        }
        return secondSmallest;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the list");
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the array elements");

        for(int i=0;i<n;i++){
            int number;
            number=sc.nextInt();
            list.add(number);
        }
        System.out.println("The second smallest number is "+getSecondSmallest(list));

    }
}
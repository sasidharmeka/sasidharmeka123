package com.deloitte.lab2.ex4;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.Collections;
public class Lab2Ex4 {
    public static int[] modifyArray(int[] array){
             Set<Integer> uniqueset = new HashSet<>();
             for(int ele:array){
                 uniqueset.add(ele);
             }
             Integer[] resultarray =uniqueset.toArray(new Integer[0]);
             Arrays.sort(resultarray,Collections.reverseOrder());
             int[] result= new int[resultarray.length];
             for(int i = 0;i<resultarray.length;i++){
                      result[i]=resultarray[i];
        }

             return result;
    }
    public static void main(String[] args){
         System.out.println("Enter the value of n");
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int [] array=new int[n];
         Scanner sc2 = new Scanner(System.in);
         System.out.println("Enter the Array");
         for(int i=0;i<n;i++){
                int num;
                num=sc2.nextInt();
                array[i]=num;
         }
         int [] modifiedArray = modifyArray(array);
         System.out.println("The Result is");
         System.out.println("The Array is "+Arrays.toString(modifiedArray));

    }
}

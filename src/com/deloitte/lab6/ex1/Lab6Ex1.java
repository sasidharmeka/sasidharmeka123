package com.deloitte.lab6.ex1;
import java.util.*;

public class Lab6Ex1 {
    public static List<Integer> getValues(Map<Integer,Integer> m){

        List<Integer> list = new ArrayList<Integer>(m.values());
        Collections.sort(list);
        return list;



    }
    public static void main(String[] args){
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        Map<Integer,Integer> m= new HashMap<Integer,Integer>();
        for(int i=1;i<=n;i++){
            int num;
            num=sc.nextInt();
            m.put(i,num);

        }
        List<Integer> sortedList = getValues(m);
        System.out.println("The sorted array is "+sortedList);


    }
}

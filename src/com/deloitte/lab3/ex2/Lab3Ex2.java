package com.deloitte.lab3.ex2;
import java.util.*;
public class Lab3Ex2 {
    public static String getImage(String name){
        StringBuffer s = new StringBuffer(name);
        String mirror= s.reverse().toString();
        return name+"|"+mirror;
    }

    public static void main(String[] args){
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = getImage(s);
        System.out.println("The output is "+ res);


}
}

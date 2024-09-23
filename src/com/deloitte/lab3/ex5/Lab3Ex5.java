package com.deloitte.lab3.ex5;
import java.util.Scanner;
public class Lab3Ex5 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text (press ENTER twice to finish input):");

        int lc=0;
        int wc=0;
        int cc=0;
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            if(line.isEmpty()){
                break;
            }
            lc+=1;
            cc+=line.length();
            String[] words = line.trim().split("\\s+");
            wc+=words.length;
        }

        System.out.println("Number of lines: " + lc);
        System.out.println("Number of words: " + wc);
        System.out.println("Number of characters: " + cc);


        sc.close();
    }
}

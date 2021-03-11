package com.edu.nefu.practice.branch;

import java.util.Scanner;

public class str {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        char ch =scan.nextLine().charAt(0);
        if (ch>='A'&&ch<='Z'){
           ch=(char)(ch+32);
        }
        System.out.println(ch);
    }
}

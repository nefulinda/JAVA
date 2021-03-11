package com.edu.nefu.practice.condition.test;

import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  read;
        int max= 0;
        do{
            read= scanner.nextInt();
            if (read>max){
                max =read;
            }
        }while (read!=0);
        System.out.println("max="+max);
    }

}

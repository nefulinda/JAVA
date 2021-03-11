package com.edu.nefu.practice.test;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();
        for (int i = 1; i <= line; i++) {
                for (int j = 1; j <=i; j++) {
                    System.out.print("*");
                }
            System.out.println();
            }
        for (int i = 1; i <= line-1; i++){
            for (int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for (int j = i; j <=line-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

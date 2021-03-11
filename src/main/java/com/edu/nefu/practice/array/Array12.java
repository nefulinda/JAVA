package com.edu.nefu.practice.array;

import java.util.Scanner;

public class Array12 {
    public static void main(String[] args) {
        int[] arrayDemo = new int[10];
        int mark =0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++, mark =i) {
            arrayDemo[i] = scan.nextInt();
        }
        System.out.println("------------------");
        int num = scan.nextInt();
        int number = scan.nextInt();
        for (int i = 0; i < arrayDemo.length; i++) {
            if (i == num) {
                for (int j = mark - 1; j >= i - 1; j--) {
                    arrayDemo[j + 1] = arrayDemo[j];
                }
                arrayDemo[i - 1] = number;
            }
        }
        for (int u:arrayDemo){
            System.out.println(u);
        }
    }
}

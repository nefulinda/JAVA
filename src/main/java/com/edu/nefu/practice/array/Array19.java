package com.edu.nefu.practice.array;

import java.util.Scanner;

public class Array19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        int read;
        for (int i = 0; i < 10; i++) {
            read = scan.nextInt();
            arr[i] = read;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = arr.length - 1; i > arr.length - 4; i--) {
            System.out.println(arr[i]);
        }
    }
}

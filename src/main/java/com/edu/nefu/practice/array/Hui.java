package com.edu.nefu.practice.array;

import java.util.Scanner;

public class Hui {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[10][10];
        System.out.println("请输入n");
        int sum = 0;
        int read = scan.nextInt();
        for (int i = 1; i <= read; i++) {
            for (int j = 1; j <= read; j++) {
                arr[i][j] = scan.nextInt();
                if (i == read || j == read || i + j == read + 1) {
                    continue;
                }
                sum = arr[i][j] + sum;
            }
        }
        System.out.println(sum);
    }
}

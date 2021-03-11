package com.edu.nefu.practice.array;

import java.util.Scanner;

public class Array26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[10][10];
        System.out.println("请输入n");
        int sum = 0;
        int read = scan.nextInt();
        for (int i = 0; i < read; i++) {
            arr[0][i] = scan.nextInt();
        }
        for (int i = 1; i < read; i++) {
            for (int j = 0; j < read; j++) {
                sum++;
                arr[i][j] = arr[0][sum % read];
                System.out.print(arr[i][j]+"\t");
            }
            sum++;
            System.out.println();
        }
    }
}

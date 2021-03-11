package com.edu.nefu.practice.array;

import java.util.Scanner;

public class Array27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[10][10];
        System.out.println("请输入n");
        int n = scan.nextInt();
        for (int k=1;k<=n;k++){
            for (int i = k; i <= 2*n-k; i++) {
                for (int j = k; j <= 2*n-k; j++) {
//                    if (i==1||i==n||j==1||j==n)
                    arr[i][j] = k;

                }
            }
        }
//
//        for (int k=n;k>n;k--){
//            for (int i = n; i > 1; i--) {
//                for (int j = n; j > 1; j--) {
//                    arr[i][j] = 1;
//                }
//            }
//        }
        for (int i = 1; i <=2*n-1; i++) {
            for (int j = 1; j <= 2*n-1; j++) {
                System.out.print(arr[i][j] +"\t");
            }
            System.out.println();
        }
    }
}

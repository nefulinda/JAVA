package com.edu.nefu.practice.array;

import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
        int[][] arrayDemo11 = new int[20][20];
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i=1;i<num;i++){
            arrayDemo11[i][i]=1;
            arrayDemo11[i][1]=1;
        }
        for (int i = 3; i < num; i++) {
            for (int j = 2; j < i; j++) {
                    arrayDemo11[i][j] = arrayDemo11[i - 1][j] + arrayDemo11[i - 1][j - 1];
            }
        }
        for (int i = 1; i < num; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(arrayDemo11[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

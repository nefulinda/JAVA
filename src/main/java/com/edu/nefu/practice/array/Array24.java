package com.edu.nefu.practice.array;

import java.util.Scanner;

public class Array24 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 8, 9, 30, 45, 66, 89, 100};
        Scanner scan = new Scanner(System.in);
         int findNum = scan.nextInt();
        int low = 0;
        int high = arr.length - 1;
        int flag = 0;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (arr[middle]==findNum) {
                System.out.println(middle + 1);
                flag = 1;
                break;
            } else if (arr[middle] > findNum) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        if (flag == 0) {
            System.out.println(-1);
        }
    }
}

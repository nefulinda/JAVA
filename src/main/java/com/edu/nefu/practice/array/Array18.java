package com.edu.nefu.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        int read;
        for (int i = 0; i < 10; i++) {
             read = scan.nextInt();
            arr[i] = read;
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int i= arr.length-1;i> 1;i--){
          sum=arr[i]+sum;
        }
        System.out.println(sum/8);
    }
}

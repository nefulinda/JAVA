package com.edu.nefu.practice.array;

public class Array06 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 11, 35, 6, 89};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int u:arr){
            System.out.print(u+"\t");
        }
    }
}


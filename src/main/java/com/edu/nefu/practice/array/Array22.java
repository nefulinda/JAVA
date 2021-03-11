package com.edu.nefu.practice.array;

public class Array22 {
    public static void main(String[] args) {
        int[] arrA = {3, 3, 4, 6, 4, 4, 4, 1, 4};
        int[] arrB = new int[10];
        int flag = 0;
        for (int i = 0; i < arrA.length; i++) {
            for (int j = i + 1; j < arrA.length; j++) {
                if (arrA[i] == arrA[j]) {
                    arrB[i]++;
                }
            }
            if (++arrB[i] > arrA.length / 2) {
                System.out.println("主元素:" + arrA[i]);
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("没有主元素");
        }
    }
}

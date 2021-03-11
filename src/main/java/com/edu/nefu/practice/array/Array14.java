package com.edu.nefu.practice.array;

public class Array14 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,5, 4, 3, 2, 1};
        int mark = 0;//判断数组是否为对称数组,0为对称，1为不对称
        int middle = arr.length / 2;
        int j = arr.length - 1;
        for (int i = 0; i < middle; i++) {
            if (arr[i] != arr[j]) {
                mark = 1;
            }
            j--;
        }
        if (mark == 1) {
            System.out.println("数组不为对称数组");
        }
        if (mark == 0) {
            System.out.println("数组为对称数组");
        }
    }
}

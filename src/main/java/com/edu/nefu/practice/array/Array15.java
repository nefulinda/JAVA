package com.edu.nefu.practice.array;

import java.util.Scanner;

public class Array15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//十进制整数转换成二进制
        int read = scan.nextInt();
        int[] arr = new int[20];
        int i = 0;
        int flag = 0;//判断是否为负数
        if (read < 0) {
            read = Math.abs(read);
            flag = 1;
        }
        if (read >= 0) {
            arr[i] = 0;
            i++;
        }
        while (read > 0) {
            arr[i] = (read % 2);
            read = read / 2;
            i++;
        }
        if (flag == 0) {
            System.out.print(0);
            for (i--; i > 0; i--) {
                System.out.print(arr[i]);
            }
        } else {
            System.out.print("1");
            for (i--; i > 0; i--) {
                System.out.print(arr[i]);
            }
        }
    }
}


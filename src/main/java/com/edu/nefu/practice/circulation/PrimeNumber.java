package com.edu.nefu.practice.circulation;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int read = scanner.nextInt();
        int max = read % 10;
        int read01 = read % 10;
        int num = 0;
        while (read > 0) {
            read01 = read % 10;
            read = read / 10;
            if (read01 == 0) {
                num++;
            }
            if (read01 > max) {
                max = read01;
            }
        }
        System.out.println("零的个数是"+num+"位数最大的是"+max);
    }
}

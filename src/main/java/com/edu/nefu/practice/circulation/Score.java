package com.edu.nefu.practice.circulation;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int read;
        int sum = 0;
        int i = 1;
        System.out.println("输入负数结束");
        while (true) {
            read = scanner.nextInt();
            if (read < 0) {
                break;
            }
            i++;
            System.out.println(i);
            sum = sum + read;
        }
        int avg = sum / --i;
        System.out.println(avg);
    }
}

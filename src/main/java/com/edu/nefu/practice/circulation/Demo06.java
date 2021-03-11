package com.edu.nefu.practice.circulation;

import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum +(double)(i + 1) /(double) i;
        }
        System.out.println(sum);
    }
}

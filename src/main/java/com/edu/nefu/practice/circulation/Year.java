package com.edu.nefu.practice.circulation;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份，月份");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("这个月一共有31天");
                break;
            case 2:
                if (year % 100 != 0 || year % 400 == 0 && year % 4 == 0) {
                    System.out.println("这个月一共有29天");
                } else {
                    System.out.println("这个月一共有28天");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("这个月一共有30天");
                break;
            default:
                System.out.println("输入数据有误");
        }
    }
}

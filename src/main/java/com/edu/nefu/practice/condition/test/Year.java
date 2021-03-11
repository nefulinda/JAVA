package com.edu.nefu.practice.condition.test;


import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个日期(yyyyMMdd)：");
        int date = scanner.nextInt();

        int year = date / 10000;
        int month = date / 100 % 100;
        int day = date % 100;

        int sum = 0;

        switch (month - 1) {
            case 11:
                sum += 30;
            case 10:
                sum += 31;
            case 9:
                sum += 30;
            case 8:
                sum += 31;
            case 7:
                sum += 31;
            case 6:
                sum += 30;
            case 5:
                sum += 31;
            case 4:
                sum += 30;
            case 3:
                sum += 31;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    sum += 29;
                } else {
                    sum += 28;
                }
            case 1:
                sum += 31;
            default:
                sum += day;
        }

        System.out.println("" + year + "年" + month + "月" + day + "日是这一年中的第" + sum + "天");
    }
}

package com.edu.nefu.practice.condition.test;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int int_Put = scan.nextInt();
        int int_Out = scan.nextInt();
        if (int_Out != 0) {
            switch (int_Put % int_Out) {
                case 0:
                    System.out.println(int_Put + "能整除" + int_Out);
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println(int_Put + "不能整除" + int_Out);
                    break;
                default:
                    System.out.println("输入格式或者数据有错误");
            }
        } else {
            System.out.println("输入格式或者数据有错误");
        }
    }
}

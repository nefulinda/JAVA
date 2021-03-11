package com.edu.nefu.practice.condition.test;

import java.util.Scanner;

public class MinVaule {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int sceond = scan.nextInt();
        int third = scan.nextInt();
        if (first < sceond) {
            if (first < third) {
                System.out.println("最小值的为" + first);
            } else {
                System.out.println("最小值的为" + third);
            }
        } else {
            if (sceond < third) {
                System.out.println("最小值的为" + sceond);
            } else {
                System.out.println("最小值的为" + third);
            }
        }
    }
}

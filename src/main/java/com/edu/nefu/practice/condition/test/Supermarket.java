package com.edu.nefu.practice.condition.test;

import java.util.Scanner;

public class Supermarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double int_Put = scan.nextDouble();
        double momey;
        if (int_Put >= 100) {
            momey = (int_Put - 100) * 0.8 + 100;
            System.out.println("应付" + momey + "元");
        } else if (int_Put < 100 && int_Put >= 50) {
            momey = (int_Put - 50) * 0.9 + 50;
            System.out.println("应付" + momey + "元");
        } else {
            momey = int_Put;
            System.out.println("应付" + momey + "元");
        }
    }
}

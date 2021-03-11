package com.edu.nefu.practice.condition.test;

import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long money;
        long taxation = scan.nextLong();
        if (taxation >= 10000) {
            money = (long) (taxation * 0.05);
            System.out.println("本次的货物征税为5%和税金为 " + money);
        } else if (taxation >= 5000 && taxation < 10000) {
            money = (long) (taxation * 0.03);
            System.out.println("本次的货物征税为3%和税金为 " + money);
        } else if (taxation >= 1000 && taxation < 5000) {
            money = (long) (taxation * 0.02);
            System.out.println("本次的货物征税为2%和税金为 " + money);
        } else {
            System.out.println("1000元以下的货物免税");
        }
    }
}

package com.edu.nefu.practice.test;

public class Chicken {
    public static void main(String[] args) {
        double money;
        int  num;
        int  a, b, c;
        for (a = 0; a <= 100; a++) {
            for (b = 0; b <= 100 - a; b++) {
                for (c = 0; c <= 100 - a - b; c++) {
                    money = a * 5 + b * 3 + ((double)c/ 3);
                    num = a + b + c;
                    if ((money == 100) && (num == 100)) {
                        System.out.println("公鸡有" + a + "只");
                        System.out.println("母鸡有" + b + "只");
                        System.out.println("小鸡有" + c + "只\n");
                    }
                }
            }
        }
    }
}

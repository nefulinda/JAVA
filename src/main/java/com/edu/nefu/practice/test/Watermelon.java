package com.edu.nefu.practice.test;

public class Watermelon {
    public static void main(String[] args) {
        int watermelonNumber = 1020;
        int i = 0;
        do {
            watermelonNumber = watermelonNumber/2 -2;
            i++;
        }while (watermelonNumber > 0);
        System.out.println("西瓜在第"+i+"天后卖完");
    }
}

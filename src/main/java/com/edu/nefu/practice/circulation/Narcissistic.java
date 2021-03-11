package com.edu.nefu.practice.circulation;

public class Narcissistic {
    public static void main(String[] args) {
        int mark;
        int sum;
        int num;
        int read;
        for (int i = 100; i < 1000; i++) {
            read = i;
            mark = read;
            sum = 0;
            num = 0;
            while (read > 0) {
                num = read % 10;
                sum = (int) Math.pow(num, 3) + sum;
                read = read / 10;
            }
            if (sum == mark) {
                System.out.println(sum);
            }
        }
    }
}

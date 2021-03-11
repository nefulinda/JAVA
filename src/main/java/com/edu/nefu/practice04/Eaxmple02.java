package com.edu.nefu.practice04;

import java.util.Scanner;

public class Eaxmple02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请依次输入直角三角形的两个直角边，斜边");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        isTiangle(a, b, c);
    }

    static boolean isTiangle(int a, int b, int c) {
        try {
            if (a * a + b * b == c * c) {
                System.out.println(a + "," + b + "," + c);
                return true;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println(a + " " + b + " " + c + " " + "不能构成直角三角形");
        }
        return false;
    }

}

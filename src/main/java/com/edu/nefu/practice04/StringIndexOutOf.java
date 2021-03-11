package com.edu.nefu.practice04;

import java.util.Scanner;

public class StringIndexOutOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        try {
            System.out.println("第四个字符为" + str.charAt(3));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(333333);
        }
        try {
            int num = Integer.parseInt(args[0]);
            System.out.println("平方为" + num * num);
        } catch (Exception e) {
            System.out.println(22222222);
        }
        System.out.println(111111);
    }
}

package com.edu.nefu.practice.condition.test;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        switch (score / 10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("成绩不合格");
                break;
            case 6:
                System.out.println("成绩合格");
                break;
            case 7:
            case 8:
                System.out.println("成绩良好");
                break;
            case 9:
                System.out.println("成绩优秀");
                break;
        }
    }
}

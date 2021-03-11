package com.edu.nefu.practice02.demo02;

import java.util.Scanner;

public class StuDemo {
    public static void main(String[] args) {
        int no;
        String ming;
        int grade;

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入N个学生数据");
        int n = scanner.nextInt();
        Stu[] stus = new Stu[n];
        System.out.println("请输入学生信息");
        for (int i = 0; i < n; i++) {
             no = scanner.nextInt();
             ming = scanner.nextLine();
            grade = scanner.nextInt();
            System.out.println("更新学生信息");
            stus[i] = new Stu(no,ming,grade);
        }
        double avgNum=0;
       // System.out.println("80分到90分的学生有");
        for (int i = 0; i < n; i++) {
            stus[i].disp();
         avgNum= stus[0].avg(stus[i]);
        }
        System.out.println("这些学生的平均值:"+avgNum);
    }
}

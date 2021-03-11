package com.edu.nefu.practice.array;

import java.util.Scanner;

public class Array16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int peopleNumber = scan.nextInt();//参与的人数
        int number = scan.nextInt();//要循环的报数
        int people = scan.nextInt();//存活的人数
        int[] arr = new int[100];
        int i = 1;
        for (; i <= peopleNumber; i++) {
            arr[i] = 1;//标记是否存活
        }
        i = 1;
        int j = 1;
        int mark = peopleNumber;//用记录是否符合
        while (mark > people) {
            if (arr[i] == 1 && j == number) {
                arr[i] = 0;
                j = 1;
                mark--;
            } else if (arr[i] == 1) {
                j++;
            }
            i++;
            i = i % peopleNumber;
        }
        for (i = 1; i <= peopleNumber; i++) {
            if (arr[i] == 1)
                System.out.println(i);
        }
    }
}

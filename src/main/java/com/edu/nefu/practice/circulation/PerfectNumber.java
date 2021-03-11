package com.edu.nefu.practice.circulation;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int read = scanner.nextInt();
        int i =1;
        int sum =0;
        while (i<read){
            if (read%i==0){
                sum= sum +i;
            }
            i++;
        }
        if (sum ==read){
            System.out.println("是完全数");
        }
        else {
            System.out.println("不是完全数");
        }
    }
}

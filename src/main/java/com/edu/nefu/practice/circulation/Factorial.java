package com.edu.nefu.practice.circulation;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num = scanner.nextInt();
        int sum=1;
        int total=0;
        for (int i=1;i<=num;i++){
            sum=1;
            for (int j=1;j<=i;j++){
                sum=sum*j;
            }
           total=total+sum;
        }
        System.out.println(total);
    }
}

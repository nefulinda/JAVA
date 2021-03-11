package com.edu.nefu.practice.circulation;

import java.util.Scanner;

public class CirculationWork01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int read = scanner.nextInt();
        int i = 1;
        while (i <=read) {
            if (read % i == 0) {
                System.out.print(i + "\t");
            }
            i++;
        }
    }
}

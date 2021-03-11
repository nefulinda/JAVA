package com.edu.nefu.practice.circulation;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();
        for (int i = 1; i <= line; i++) {
            for (int k = 1; k <= line - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (i == 1 || i == line) {
                    System.out.print("*");
                } else {
                    if (j == 1 || j == 2 * i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        } //一共6行
//     *             空格 5     星星1      第几行 1
//    * *                6        2            2     5 7
//   *   *               8        2            3     4 8
//  *     *              10       2            4     3 9
// *       *             12       2            5     2 10
//***********            0        11           6

//        for (int i = 1; i <= line; i++) {
//            for (int k = 1; k <= line - i; k++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= line - 1; i++) {
//            for (int k = 1; k <= i; k++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 2 * (line - 1) - 2 * i + 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}

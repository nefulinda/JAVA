package com.edu.nefu.practice.array;

public class Array07 {
    public static void main(String[] args) {
        int[][] arrDemo = {{1}, {
                2, 3
        }, {
                4, 5, 6
        }};
        for (int i = 0; i < arrDemo.length; i++) {
            for (int j = 0; j < arrDemo[i].length; j++) {
                System.out.print(arrDemo[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

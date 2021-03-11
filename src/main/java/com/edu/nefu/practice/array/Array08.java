package com.edu.nefu.practice.array;

public class Array08 {
    public static void main(String[] args) {
        int oldArr[] = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
        int mark = oldArr.length;
        for (int u : oldArr) {
            if (u == 0) {
                mark = --mark;
            }
        }
        int[] newArr = new int[mark];
        int j = 0;
        for (int i = 0; i < oldArr.length; i++) {
            if (oldArr[i] != 0) {
                newArr[j] = oldArr[i];
                mark = j;
                j++;
                System.out.print(newArr[mark] + "\t");
            }
        }
    }
}


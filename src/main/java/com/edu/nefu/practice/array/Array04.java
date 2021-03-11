package com.edu.nefu.practice.array;

public class Array04 {
    public static void main(String[] args) {
        int[] arrayDemo = {6, 1, 2, 3, 5};
        int flag = 0;
        for (int u:arrayDemo){
            if (u == 5){
               flag = 1;
                break;
            }
        }
        if (flag == 1){
            System.out.println("数字5在此数组中");
        }
        else {
            System.out.println("数字5不在此数组中");
        }
    }
}

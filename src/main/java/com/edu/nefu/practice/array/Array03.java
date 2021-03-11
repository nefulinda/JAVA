package com.edu.nefu.practice.array;

public class Array03 {
    public static void main(String[] args) {
        int[] arrayDemo = {6, 1, 2, 3, 5};
        int low = 0, high = arrayDemo.length - 1;
        int flag = 0;

        while (low < high) {
            int middle = (low + high) / 2;
            if (arrayDemo[middle] == 5) {
                flag = 1;
            }
            else if (arrayDemo[high]>arrayDemo[middle]){
                high = high-1;
            }
            else {
                low = low+1;
            }
        }
        if (flag == 1) {
            System.out.println("数字5在此数组中");
        } else {
            System.out.println("数字5不在此数组中");
        }
    }
}

package com.edu.nefu.practice.array;

public class Array13 {
    public static void main(String[] args) {
        int  flag = 0;//
        int[] arr = {10, 20, 11, 35, 6, 89,0,0};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length-1 ; j++) {
                        if (arr[i]== arr[j+1] ){
                            flag=1;
                        }
            }
        }
        if (flag ==1){
            System.out.println("数组中有重复的数");
        }
        else {
            System.out.println("数组没有中有重复的数");
        }
    }
}

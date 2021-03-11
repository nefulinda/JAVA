package com.edu.nefu.practice.array;

import java.util.Random;

public class Array20 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random =new Random(20);
        for (int i=0;i<10;i++){
            arr[i]= random.nextInt(100);
        }
        for (int u:arr)
        System.out.println(u);
    }
}

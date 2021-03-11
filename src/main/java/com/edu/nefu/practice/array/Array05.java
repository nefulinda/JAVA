package com.edu.nefu.practice.array;

public class Array05 {
    public static void main(String[] args) {
        int[] arrayDemo = {6, 1, 2, 3, 5,8,7,9,4,15};
        double sum = 0;
        for (int u: arrayDemo){
            sum = sum+u;
        }
        System.out.println("平均值为:"+(sum/arrayDemo.length));
    }
}

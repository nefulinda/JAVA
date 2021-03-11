package com.edu.nefu.practice.array;

public class Array01 {
    public static void main(String[] args) {
        int[] arrayDemo = {1,2,3,4,5};
        int[] arrayDemo02 = new  int[5];
        for (int i= arrayDemo.length-1,j=0;i>=0;i--,j++){
           arrayDemo02[j] = arrayDemo[i];
            System.out.print(arrayDemo02[j]+"\t");
        }
    }
}

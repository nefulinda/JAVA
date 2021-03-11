package com.edu.nefu.practice.array;

public class ArrayMao {
    public static void main(String[] args) {
        int[] arrayDemo = {10,20,11,35,6,89,6 ,5 ,4,56 ,12 ,3, 2 ,1,6 ,5 ,4, 3, 2 ,110,20,11,35,6,89};
        for (int i=0;i<arrayDemo.length;i++){
            for (int j=i;j<arrayDemo.length;j++){
                if (arrayDemo[i]>arrayDemo[j]){
                    int temp = arrayDemo[j];
                    arrayDemo[j] = arrayDemo[i];
                    arrayDemo[i] = temp;
                }
            }
        }
        for (int u: arrayDemo){
            System.out.println(u);
        }
    }
}


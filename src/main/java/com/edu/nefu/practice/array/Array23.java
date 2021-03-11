package com.edu.nefu.practice.array;

import java.util.HashSet;
import java.util.Set;

public class Array23 {
    public static void main(String[] args) {
        int[] arrA = {1,2,3,4,6,3,2,3};
        int[] arrB = {3, 4, 6, 9, 30, 66, 100};
        int[] arrC = new int[arrA.length];
        Set<Integer> set=new HashSet<Integer>();
        int k =0;
        for (int i=0;i< arrA.length;i++){
             for (int j=0;j<arrB.length;j++){
                 if (arrA[i]==arrB[j]){
                    // set.add(arrA[i]);
                     arrC[k]=arrA[i];
                     k++;
                 }
             }
        }
        for (int i=0;i<k;i++){
            System.out.println(arrC[i]);
        }
        //Integer[] b=set.toArray(new Integer[0]);
       // System.out.println(Arrays.toString(b));
    }
}

package com.edu.nefu.practice.array;

import java.util.Arrays;

public class Array09 {
    public static void main(String[] args) {
        int[] arrA = {1, 7, 9, 11, 13, 15, 17, 19};
        int[] arrB = {2, 4, 6, 8, 10};
        int lengC = arrA.length + arrB.length;
        int[] arrC = new int[lengC];
        int i = 0, a = 0, b = 0;
        while (i < lengC) {
            if (arrA[a] > arrB[b]) {
                arrC[i] = arrB[b];
                b++;
            } else {
                arrC[i] = arrA[a];
                a++;
            }
            i++;
            if (a>=arrA.length||b>=arrB.length){
                break;
            }
        }
          if (arrA.length>arrB.length){
              for (;a<arrA.length;a++){
                  arrC[i]=arrA[a];
                  i++;
              }
          }
          else {
              for (;b<arrB.length;b++){
                  arrC[i]=arrB[b];
                  i++;
              }
          }
//        System.arraycopy(arrA, 0, arrC, 0, arrA.length);
//        System.arraycopy(arrB, 0, arrC, arrA.length, arrB.length);
//        Arrays.sort(arrC);//给数组c进行升序拍序，Arrays.sort()是Arrays类的静态方法，可以直接拿来使用
        System.out.println(Arrays.toString(arrC));
    }
}

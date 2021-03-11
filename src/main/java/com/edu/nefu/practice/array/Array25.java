package com.edu.nefu.practice.array;

import java.util.Arrays;

public class Array25 {
    public static void main(String[] args) {
        int[] a = {5, 6, 8, 0, 6, 2, 0,0, 1, 0, 56};
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                count++;
            }else if(a[i]!=0&&count!=0)
            {
                a[i-count]=a[i];
                a[i]=0;
            }
        }
        System.out.println(Arrays.toString(a));
//        int mark = 0;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == 0) {
//                for (int j = i; j < a.length - 1; j++) {
//                    a[j] = a[j + 1];
//                }
//                mark++;
//            }
//        }
//        for (int i = a.length - mark; i < a.length; i++) {
//            a[i] = 0;
//        }
//        for (int u : a)
//            System.out.print(u + "\t");
    }
}

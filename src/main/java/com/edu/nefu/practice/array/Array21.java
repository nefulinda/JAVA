package com.edu.nefu.practice.array;

import java.util.Arrays;

public class Array21 {
    public static void main(String[] args) {
        int[] a = {1, 2, 8, 45, 89};
        int[] b = {3, 4, 6, 9, 30, 66, 100};
        int[]  c = new int[a.length+b.length];
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        Arrays.sort(c);
        for (int u:c){
            System.out.print(u+"\t");
        }
    }
}

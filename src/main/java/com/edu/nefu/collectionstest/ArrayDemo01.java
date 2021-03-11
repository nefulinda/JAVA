package com.edu.nefu.collectionstest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArrayDemo01 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            arr.add(i);
        }
        ArrayList<Integer> arrNew = new ArrayList<>();
        Random r = new Random();
        for (int i = 1; i <= 10; i++) {
            int s = r.nextInt(arr.size()) + 1;
            arrNew.add(arr.get(s - 1));
            arr.remove(s - 1);
        }
        for (Integer u : arrNew) {
            System.out.print(u + "\t");
        }
        System.out.println();
        int[] arrArray = new int[arrNew.size()];
        for (int i = 0; i < arrNew.size(); i++) {
            arrArray[i] = arrNew.get(i);
        }
        Arrays.sort(arrArray);
        for (int i = 0; i < arrArray.length; i++) {
            System.out.print(arrArray[i] + "\t");
        }
        System.out.println();
        for (int i = arrArray.length - 1; i >=0; i--) {
            System.out.print(arrArray[i] + "\t");
        }
    }
}

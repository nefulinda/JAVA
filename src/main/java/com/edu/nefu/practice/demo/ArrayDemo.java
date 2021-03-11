package com.edu.nefu.practice.demo;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        /*java中声明数组的两种方式   类型[] 数组名、 类型 数组名[]不建议使用
         *数组的三种表达方式
         *类型[] 数组名 = new 类型[长度];
         * 类型[] 数组名 = {数据1，数据2，数据3};
         * 类型[] 数组名 = new 类型{数据1，数据2，数据3};
         */
        int[] array_Demo = {5, 2, 6, 4, 5};//第一种数组的声明方式 类型[] 变量名
        int arrayDemo[] = {9, 2, 2, 3, 5}; // 一种兼容的数组声明方式，不建议使用
        //二维数组 类型[][] 变量名 ={{数据1，数据2，数据3},{数据1，数据2，数据3},······} 不规则数组
        //二维数组  类型[][] 变量名 = new 类型[长度][长度]
        int[][][] arrDemo = {
                {
                        {1, 4, 3, 2, 1},
                        {1, 4, 3, 2, 1}
                },
                {
                        {1, 4, 3, 2, 1},
                        {1, 4, 3, 2, 1}
                },
                {
                        {1, 4, 3, 2, 1},
                        {1, 4, 3, 2, 1},
                }
        };
        Arrays.sort(array_Demo);//排序
        for (int i = 0; i < arrDemo.length; i++) {
            for (int j = 0; j < arrDemo[i].length; j++) {
                for (int k = 0; k< arrDemo[i][j].length; k++) {
                    System.out.print(arrDemo[i][j][k] + "\t");
                }

            }
            System.out.println();
        }
    }
}

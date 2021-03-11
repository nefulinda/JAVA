package com.edu.nefu.practice03;

import java.util.Scanner;

public class StrDemo10 {
    public static void main(String[] args) {
       String str= "abkkcdkkefkkskk";
        Scanner scan = new Scanner(System.in);
        String str22 = scan.next();
        int count = 0;
        //下标(从什么位置开始查找)
        int index = 0;
        /*通过indexOf方法从下标为0的位置进行查找，如果indexOf查找不到就会返回-1，
         * 将-1赋值给index，接着index和0进行比较，条件不成立结束循环
         *	如果能够找到，将下标的值赋值给index，然后进入循环体记一次数
         */
        while((index=str.indexOf(str22,index))!=-1){
            count++;

            /*查找到kk后的下标需要+2(子字符串个数在这里是2)，
             *然后再进入while循环体内进入新一轮的查找
             */
            index=index +2;
        }
        System.out.println("字符子串"+str22+"出现的个数="+count);
    }
}

package com.edu.nefu.practice03;

import java.util.ArrayList;

public class SrtTirm {
    public static void main(String[] args) {
//       String str ="abcdefgeee";
//       StringBuffer stringBuffer = new StringBuffer(str);
//        System.out.println(stringBuffer.reverse());
//        System.out.println(strReversal(str,0,5));
        String str12 ="iu7..i8h   ..y4jnb2";
        String str13 = str12.replaceAll("[a-z[\\.][ ]]","");
        System.out.println(str13);
    }
    public static String strReversal(String str,int start,int end){
        if (str != null){
            char[] chars = str.toCharArray();
            for (int i = start,j = end;i < j;i++,j--){
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
            }
            return new String(chars);
        }

        return null;
    }
    public static String myTrim(String str) {
        if (str != null) {
            int start = 0;// 用于记录从前往后首次索引位置不是空格的位置的索引
            int end = str.length() - 1;// 用于记录从后往前首次索引位置不是空格的位置的索引

            while (start < end && str.charAt(start) == ' ') {
                start++;
            }

            while (start < end && str.charAt(end) == ' ') {
                end--;
            }
            if (str.charAt(start) == ' ') {
                return "";
            }

            return str.substring(start, end + 1);
        }
           return null;
    }
}
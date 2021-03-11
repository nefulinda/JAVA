package com.edu.nefu.practice03;

import java.util.Arrays;

public class StrDemo11 {
    public static void main(String[] args) {
        //  System.out.println(equalStr("aba","abb"));
        System.out.println(equalString("abcwerthelloyuiodef","cvhellobnm"));
    }

    static String equalString(String str1, String str2) {
        String max = str1.length() > str2.length() ? str1 : str2;
        String min = str1.length() < str2.length() ? str1 : str2;
        for (int i = 0; i < min.length(); i++) {
           for (int j=0,k=min.length()-i;k<=min.length();j++,k++){
               String str3 = min.substring(j,k);
               if (max.contains(str3))
                   return  str3;
           }
        }
        return null;
    }

    static boolean equalStr(String str1, String str2) {
        if (str1.equals(str2)) {
            return true;
        }
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] chars01 = str1.toCharArray();
        char[] chars02 = str2.toCharArray();
        Arrays.sort(chars01);
        Arrays.sort(chars02);
        for (int i = 0; i < str1.length(); i++) {
            if (chars01[i] != chars02[i]) {
                return false;
            }
        }
        return true;
    }
}

package com.edu.nefu.practice03;

public class Eaxmple06 {
    public static void main(String[] args) {
        String str = "this is a test of   java";
   //    char[] c = new char[str.length()];
        String[] str24 = str.split(" +");
        for (String u:str24){
            System.out.println(u);
        }
//       StringBuffer stringBuffer =new StringBuffer(str.length());
//       int i=str.length()-1;
//       while (i>=0){
//           stringBuffer.append(str.charAt(i));
//           i--;
//       }
//        System.out.println(stringBuffer);
//        for (int i=str.length()-1;i>=0;i--){
//            System.out.print(str.charAt(i));
//        }
//        int j = 0;
//        while (j <=str.length()-1) {
//            String str19 = str.substring(j, j + 1);
//            c[j] = str19.charAt(0);
//            j++;
//        }
//        for (char a: str.toCharArray()){
//            c[j]=a;j++;
//        }
//        for (int i = 0; i < str.length(); i++) {
//           c[i]= str.charAt(i);
//        }
//        String[] str21 = new String[str.length()];
//        for (int i = 0; i < str.length()-1; i++) {
//             str21[i] = str.substring(i,i+1);
//            if (i==0||str21[i-1].equals(" ")&&!str21[i].equals(" "))
//            System.out.print(str21[i].toUpperCase()+"\t");
//        }
//        String str16 = str.replace("s","");
//        int num =str.length()-str16.length();
//        System.out.println("s:"+num);
//        String str17 = "test";
//        int num = 0;
//        do {
//            String str18 = str.substring(num, str17.length() + num);
//            if (str18.equals(str17)) {
//                System.out.println(str18);
//                break;
//            }
//            num++;
//        } while (num<=str.length()-str17.length());
//        System.out.println(num);
    }
}

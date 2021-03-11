package com.edu.nefu.practice03;

public class StrDemo08 {
    //    6.求出字符串中有多少种字符，以及每个字符的个数
    static void printCharInfo(String str) {
//        for (char c ='A'; c>='A'&&c<='z'; c++) {
//            int num=0;//标记字母的个数
//            for (char at : str.toCharArray()) {
//                if (c==at){
//                    num++;
//                }
//            }
//            if (num!=0){
//                System.out.println(c+":"+num);
//            }
//        }
        while (!"".equals(str)) {
            String c = str.substring(0, 1);
            String tempStr = str.replace(c, "");
            System.out.println(c + " : " + (str.length() - tempStr.length()));
            str = tempStr;
        }
    }

    //7.定义一个方法，用来去掉字符串右边的空格
    static String rtrim(String str) {
        while (str.endsWith(" ")) {
            int num = str.lastIndexOf(" ");
            str = str.substring(0, num - 1);
        }
        return str;
    }

    //8.定义一个方法，将str所指字符串的正序和反序进行连接
    static String concat(String str) {
        int num = str.length();
        while (num > 0) {
            str = str + str.substring(num - 1, num);
            num--;
        }
        return str;
    }

    //   9.字符串右移n位
    static String moveToRight(String str, int position) {
        String strConcat = str.substring(0, str.length() - position);
        str = str.substring(str.length() - position, str.length());
        str = str + strConcat;
        return str;
    }

    //10.求5个字符串中最长的那个，把最长的字符串打印出来
    static String maxStr(String[] str, int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = str[i].length();
        }
        int max = a[0];
        int flag = 0;//标记字符串长度最长的
        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
                flag = i;
            }
        }
        return str[flag];
    }

    //11.若可以从一个源字符串中， 找到一个相同的字符串(忽略大小写)， 则返回第一个字符的索引位置，否则返回-1。
    static int stringAt(String str, String subStr) {
        int num = 0;
        while (subStr.length() + num <= str.length()) {
            String jiequ = str.substring(num, subStr.length() + num);
            if (jiequ.equals(subStr)) {
                return num;
            }
            num++;
        }
        return -1;
    }
//回文数
    static boolean huiWen(String str) {
        String huiStr = str.substring(0, str.length() / 2);
        String wenStr = str.substring(str.length() / 2, str.length());
        for (int i=0,j=wenStr.length()-1;i<huiStr.length()&&j>0;i++,j--){
            if (wenStr.charAt(j)!=huiStr.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 0;

        String str10 ="01#张三#20-02#李四#30-03#王五#40";
        String[] str11 =str10.split("#|-");
        int sum =0;
        for (int i=0;i<str11.length;i++){
          if (i%3==0&&i!=0){
              System.out.println();

          }
          if ((i+1)%3==0){
              sum= sum+Integer.parseInt(str11[i]);
          }
            System.out.print(str11[i]+"\t");
        }
        System.out.println();
        System.out.println("总分:"+sum);
//        System.out.println(huiWen("qazzaq"));
//        String str9 = "name-age-sex-address";
//        System.out.println(stringAt(str9, "age"));
//        String[] strings = new String[5];
//        strings[0]="hello world";
//        strings[1]= "ok";
//        strings[2]="卡巴斯基#杀毒软件#免费版#俄罗斯#";
//        strings[3]="name-age-sex-address";
//        strings[4]="Hello java";
//        System.out.println( maxStr(strings,5).length());
//        System.out.println(maxStr(strings,5));


//        String str8 = "hello world";
//        str8 = moveToRight(str8, 4);
//        System.out.println(str8);
//        String str7 = "ok";
//        str7 = concat(str7);
//        System.out.println(str7);
//         String str6 = "apple is a apple.     ";
//         printCharInfo(str6);
//        str6 = rtrim(str6);
//        System.out.println(str6);

//        1.字符串解析,现有一字符串,"卡巴斯基#杀毒软件#免费版#俄罗斯#",解析出每个元素
//        String str0 = "卡巴斯基#杀毒软件#免费版#俄罗斯#";
//        String[] newStr = str0.split("#");
//        for (String i : newStr) {
//            System.out.println(i);
//            System.out.println(++num);
//        }

//        5.有如下格式的字符串name-age-sex-address,解析出姓名,年龄等信息。
//        String str5 ="name-age-sex-address";
//        String[] newStr5 = str5.split("-");
//        for (String i : newStr5) {
//            System.out.println(i);
//        }
//        for (int i=0;i<newStr.length;i++){
//            System.out.println(newStr[i]);
//        }

        //   }
//        System.out.println(str0.indexOf("#"));
//        System.out.println(str0.replace("#",""));

//        2."那车水马龙的人世间,那样地来 那样地去,太匆忙"最后一次出现"那"的位置。
//        String str1 = "那车水马龙的人世间,那样地来 那样地去,太匆忙";
//        String str2 = "Hello java";
//        System.out.println(str1.lastIndexOf("那"));
        //  Scanner scanner = new Scanner(System.in);

//        3.判断输入的字符串是否是 .java 结束
//        String str = scanner.nextLine();
//        while (!str.endsWith("java")) {
//            str = str + scanner.nextLine();
//        }
//        System.out.println(str);

//        4.有一身份证号,判断此为男还是女,基于此方法,写一个算法,判断一个身份证号为男还是女。
//        String str3 = scanner.nextLine();
//        if (str3.length()==15){
//            System.out.println("男的身份证");
//        }
//        else if (str3.length()==18){
//            System.out.println("女的身份证");
//        }
//        else {
//            System.out.println("输入的数据不符合");
//        }
    }
}

package com.edu.nefu.collectionstest;

import java.util.ArrayList;
import java.util.Random;

public class ArrayDemo02 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList list = new ArrayList();
        list.add("科特迪瓦");
        list.add("阿根延");
        list.add("澳大利亚");
        list.add("塞尔维亚");
        list.add("荷兰");
        list.add("尼日利亚");
        list.add("日本");
        list.add("美国");
        list.add("中国");
        list.add("新西兰");
        list.add("巴西");
        list.add("比利时");
        list.add("韩国");
        list.add("喀麦隆");
        list.add("洪都拉斯");
        list.add("意大利");
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        ArrayList list3 = new ArrayList();
        ArrayList list4 = new ArrayList();
        for (int i = 0; i < 16; i++) {
            Random ss = new Random();
            int num = ss.nextInt(list.size()) + 1;
            //依次分出四个国家作为一个小组
            if (i < 4) {
                list1.add(list.get(num - 1));
                list.remove(num - 1);
            } else if (i < 8) {
                list2.add(list.get(num - 1));
                list.remove(num - 1);
            } else if (i < 12) {
                list3.add(list.get(num - 1));
                list.remove(num - 1);
            } else {
                list4.add(list.get(num - 1));
                list.remove(num - 1);
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            String str = (String) list1.get(i);
            System.out.print(str + "  ");
        }
        System.out.println();
        for (int i = 0; i < list2.size(); i++) {
            String str = (String) list2.get(i);
            System.out.print(str + "  ");
        }
        System.out.println();
        for (int i = 0; i < list3.size(); i++) {
            String str = (String) list3.get(i);
            System.out.print(str + "  ");
        }
        System.out.println();
        for (int i = 0; i < list4.size(); i++) {
            String str = (String) list4.get(i);
            System.out.print(str + "  ");
        }
        System.out.println();
    }
}

package com.edu.nefu.practice.test;

public class Default {
    int i;
    char ch;
    float f;
    double d;
    String st;
    boolean b;
    public static void main(String[] args) {
        Default aDefault = new Default();
        System.out.println("int类型的默认值为："+aDefault.i);
        System.out.println("char类型的默认值为："+aDefault.ch);
        System.out.println("float类型的默认值为："+aDefault.f);
        System.out.println("double类型的默认值为："+aDefault.d);
        System.out.println("String类型的默认值为："+aDefault.st);
        System.out.println("boolean类型的默认值为："+aDefault.b);
    }

}

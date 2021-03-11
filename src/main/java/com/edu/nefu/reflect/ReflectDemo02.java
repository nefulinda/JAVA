package com.edu.nefu.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo02 {
    public static void main(String[] args) {
//        //一共有三种方式可以得到Class类型的对象
//        Class c1 = null;
//        Class c2 = null;
//        Class c3 = null;
//        //第一种方式:
//        try {
//            c1 = Class.forName("com.edu.nefu.reflect.People");
//        } catch (ClassNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        System.out.println("类的名称："+c1.getName());
//
//
//        //第二种方式:
//        c2 = new People().getClass();
//        System.out.println("类名称："+c2.getName());
//
//        //第三种方式:
//        c3 = People.class;
//        System.out.println("类名称："+c3.getName());
//        People people = new People("lisi", 26);
//        System.out.println(people);
//        Class c1 = null;
//        try {
//            c1 = Class.forName("com.edu.nefu.reflect.People");
//            People per = (People) c1.newInstance();
//            per.setAge(19);
//            per.setName("张三");
//            System.out.println(per);
//        } catch (ClassNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
// 当一个类中如果没有无参数构造器的时候，我们如何进行调用
        Class c1 = null;
        try {
            c1 = Class.forName("com.edu.nefu.reflect.People");
            //通过getConstructors()方法我们可以获取到一个类中全部的构造方法
            Constructor[] cons = c1.getConstructors();
            Constructor con = cons[0];
            People per = null;
            per = (People) con.newInstance("张三", 20);
            System.out.println(per);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}

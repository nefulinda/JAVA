package com.edu.nefu.reflect;

import java.lang.reflect.Constructor;

public class ReflectDemo01 {
    public static void main(String[] args) {
        Class c1 = null;
        try {
            c1 = Class.forName("com.edu.nefu.reflect.People");
            getInterfaces(c1);
            System.out.println();
            getAllConstrcutors(c1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void getInterfaces(Class c) {
        Class[] classes = c.getInterfaces();
        for (Class cs : classes) {
            System.out.println(cs);
        }
    }
    public static void getAllConstrcutors(Class c1){
        Constructor[] cons = c1.getConstructors();
        for(Constructor con:cons){
            System.out.println(con);
        }
    }
}

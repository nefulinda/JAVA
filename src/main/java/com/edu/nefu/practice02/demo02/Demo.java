package com.edu.nefu.practice02.demo02;

public class Demo {
    public static void main(String[] args) {
        Student student = new Student("Jack", 22, "男", 98, 92, 91, 96, 85);
        student.toPerson();
        student.toStudent();
        Sifter sifter = new Sifter();
        for (int i=0;i<=10;i++)
        System.out.println(sifter.roll());
    }
}

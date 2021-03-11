package com.edu.nefu.practice02.demo02;

public class Person {
    private String name;
    private int age;
    private String sex;

    public Person() {

    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public void toPerson(){
        System.out.println("姓名:"+name);
        System.out.println("年龄:"+age);
        System.out.println("性别:"+sex);
    }
}

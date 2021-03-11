package com.edu.nefu.homework.example03;

public abstract class Employee {
    private String name;//员工的姓名
    private int number;//员工的编号
    private MyDate birthday;//员工的生日

    //  private  static int  number;//员工的编号
    public Employee() {
        //   number++;//员工编号自增
    }

    //    public Employee(String name, MyDate birthday) {
//        this.name = name;
//        this.number = ++number; //员工编号自增
//        this.birthday = birthday;
//    }
    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    //薪水的计算方法
    abstract double earnings(int month);

    //遍历员工信息
    public void toEmployee() {
        System.out.println("姓名:" + this.name);
        System.out.println("员工编号:" + this.number);
        this.birthday.toDateStirng();
    }
}

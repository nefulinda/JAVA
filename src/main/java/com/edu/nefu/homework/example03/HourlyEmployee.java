package com.edu.nefu.homework.example03;

public class HourlyEmployee extends Employee{
    private double wage;//工资
    private int  hour;//工作小时

//    public HourlyEmployee(String name,  MyDate birthday, double wage, int hour) {
//        super(name, birthday);
//        this.wage = wage;
//        this.hour = hour;
//    }
    public HourlyEmployee(String name, int number, MyDate birthday, double wage, int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public double getWage() { return wage; }

    public void setWage(double wage) { this.wage = wage; }

    public double getHour() { return hour; }

    public void setHour(int hour) { this.hour = hour; }
    //薪水的计算方法
    @Override
    double earnings(int month) {
        return wage*hour;
    }
    //打印基本信息
    public void toEmployee(){
        System.out.println("姓名:"+getName());
        System.out.println("员工编号:"+getNumber());
        getBirthday().toDateStirng();
        System.out.println("每小时的工资:"+getWage());
        System.out.println("工作的时间:"+getHour());
    }
}

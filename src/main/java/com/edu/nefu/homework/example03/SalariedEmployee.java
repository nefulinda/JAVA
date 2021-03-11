package com.edu.nefu.homework.example03;

public class SalariedEmployee extends Employee {
    private double monthlySalary;//月薪

//    public SalariedEmployee(String name, MyDate birthday, double monthlySalary) {
//        super(name,  birthday);
//        this.monthlySalary = monthlySalary;
//    }
    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
   //薪水的计算方法
    @Override
    double earnings(int month) {
        if (month == getBirthday().getMonth()) {
            return monthlySalary + 100;
        } else {
            return monthlySalary;
        }
    }
    //打印基本信息
    public void toEmployee() {
        System.out.println("姓名:" + getName());
        System.out.println("员工编号:" + getNumber());
        getBirthday().toDateStirng();
        System.out.println("月薪:" + getMonthlySalary());
    }
}

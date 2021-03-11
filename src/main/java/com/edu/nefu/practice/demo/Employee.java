package com.edu.nefu.practice.demo;

public   class Employee {
    private String name;
    private double salary;
    private  MyDate hireDay;

    public Employee(){

    }
    public Employee(String name, double salary, MyDate hireDay) {
        this.name = name;
        this.salary = salary;
        this.hireDay = hireDay;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(MyDate hireDay) {
        this.hireDay = hireDay;
    }
    public void   tooString(){
        System.out.println("姓名:"+this.name);
        System.out.println("年薪:"+this.salary);
        System.out.println("入职时间:"+hireDay.getYear()+"年"+hireDay.getMonth()+"月"+hireDay.getDay()+"日");
    }
    public void raiseSalay(double byPercent){
        this.salary =salary*(1+byPercent);
    }
    public void work(){

    }
}

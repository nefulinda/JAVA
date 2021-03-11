package com.edu.nefu.practice05;

public class Employee {
    private int  num;
    private String name;
    private int  age;
    private double salary;
    private String IDNum;//身份证
    private static int employesNum=1;//员工人数
    private static double employesSalary=102000;//员工工资总额

    public Employee(int  num, String name, int  age) throws AgeLowException, AgeHighException, NullException {

        if (name.equals(null)||name.equals("")){
            throw  new NullException("姓名为空");
        }
        if (age>60){
            throw new AgeLowException("年龄过高");
        }
        if (age<18){
            throw new AgeHighException("年龄过低");
        }
        this.num = num;
        this.name = name;
        this.age = age;
        this.employesNum++;
    }

    public Employee( double salary, String IDNum) throws SalaryLowException, IDException {
        if (salary<600){
            throw new SalaryLowException("工资过低");
        }
        if (IDNum.length()!=18){
            throw new IDException("身份证号码不正确");
        }
        this.salary = salary;
        this.IDNum = IDNum;
        this.employesSalary=salary+this.employesSalary;
        this.employesNum++;
    }


    double addSalary(double amount) throws SalaryHighException {
        salary=salary+amount;
        if (salary>employesSalary){
            throw new SalaryHighException("工资过高");
        }
        this.employesSalary=salary+this.employesSalary;
        return salary;
    }
    double minusSalary(double amount) throws SalaryLowException {
        salary=salary-amount;
        if (salary<600){
            throw new SalaryLowException("员工工资过低") ;
        }
        this.employesSalary=salary+this.employesSalary;
        return salary;
    }
    void showToalSalary() throws NullException {
        if (employesSalary<=0){
            throw new NullException("员工工资总额为零，异常");
        }
        System.out.println("员工工资总额："+employesSalary);
    }
    void shoTotalEmployee() throws NullException {
        if (employesNum<=0){
            throw new NullException("员工人数为零，异常");
        }
        System.out.println("员工人数："+employesNum);
    }
}

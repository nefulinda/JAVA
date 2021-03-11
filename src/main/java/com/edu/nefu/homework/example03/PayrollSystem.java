package com.edu.nefu.homework.example03;

public class PayrollSystem {
    public static void main(String[] args) {
        HourlyEmployee[] hourlyEmployees = new HourlyEmployee[3];
        SalariedEmployee[] salariedEmployees = new SalariedEmployee[3];
        hourlyEmployees[0] = new HourlyEmployee("Tom", 10246, new MyDate(2000, 1, 1), 100, 256);
        hourlyEmployees[1] = new HourlyEmployee("Jack", 10247, new MyDate(1999, 3, 2), 120, 250);
        hourlyEmployees[2] = new HourlyEmployee("Mike", 10248, new MyDate(2002, 10, 12), 82, 260);
        salariedEmployees[0] = new SalariedEmployee("Jim", 10001, new MyDate(1998, 6, 9), 26000);
        salariedEmployees[1] = new SalariedEmployee("lala", 10002, new MyDate(1997, 8, 9), 36000);
        salariedEmployees[2] = new SalariedEmployee("zzzz", 10003, new MyDate(1996, 9, 9), 46000);
        for (HourlyEmployee i : hourlyEmployees) {
            i.toEmployee();
            System.out.println("本月获得薪水" + i.earnings(6));
            System.out.println("---------------------------------");
        }

        for (SalariedEmployee i : salariedEmployees) {
            i.toEmployee();
            System.out.println("本月获得薪水" + i.earnings(6));
            System.out.println("---------------------------------");
        }

    }
}

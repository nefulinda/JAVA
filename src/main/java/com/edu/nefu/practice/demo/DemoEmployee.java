package com.edu.nefu.practice.demo;

public class DemoEmployee {
    public static void main(String[] args) {
//        MyDate[] myDates = new MyDate[5];
//        myDates[0] = new MyDate("2020", "9", "19");
//        myDates[1] = new MyDate("2020", "8", "18");
//        myDates[2] = new MyDate("2020", "6", "17");
//        myDates[3] = new MyDate("2020", "7", "16");
//        myDates[4] = new MyDate("2020", "5", "15");
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Tom", 300000, new MyDate("2020", "9", "19"));
        employees[1] = new Employee("Jim", 320000, new MyDate("2020", "8", "18"));
        employees[2] = new Employee("Jack", 450000, new MyDate("2020", "6", "17"));
        employees[3] = new Employee("Mike", 620000, new MyDate("2020", "7", "16"));
        employees[4] = new Employee("Java", 280000, new MyDate("2020", "5", "15"));
        int num = 0;
        for (Employee u : employees) {
            if (num % 2 == 0) {
                employees[num].raiseSalay(0.05);
            }
            System.out.println("职工号"+num);
            u.tooString();
            num++;
            System.out.println("---------------------------------------------");
        }
    }
}

package com.edu.nefu.practice.demo;

public class MyDate {
    private String year;
    private String month;
    private String day;

    public MyDate() {

    }

    public MyDate(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
    public  void  toDateStirng(){
        System.out.println("入职时间:"+getYear()+"年"+getMonth()+"月"+getDay()+"日");
    }
}

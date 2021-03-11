package com.edu.nefu.practice.demo;

public class Account {
    private int id;
    protected double balance;
    private double annualInterestRate;


    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;//账号
        this.balance = balance;//余额
        this.annualInterestRate = annualInterestRate;//年利率
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("余额不足,取款失败。余额还剩:" + balance);
        } else {
            this.balance = balance - amount;
            System.out.println("成功取出:" + amount);
        }
    }

    public double getMonthInterest() {
        return annualInterestRate / 12;
    }

    public void deposit(double amount) {
        this.balance = balance + amount;
        System.out.println("成功存入" + amount);
    }
}

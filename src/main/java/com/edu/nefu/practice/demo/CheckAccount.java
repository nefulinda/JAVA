package com.edu.nefu.practice.demo;

public class CheckAccount extends Account {
    private double overdraft;

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            System.out.println("成功取出:" + amount);
            setBalance(getBalance()-amount);
        } else {
               if (overdraft>=amount-getBalance()){
                   overdraft=overdraft-(amount-getBalance());
                   setBalance(0);
               }
               else {
                   System.out.println("超过可透支额的限额");
               }
        }
    }
}

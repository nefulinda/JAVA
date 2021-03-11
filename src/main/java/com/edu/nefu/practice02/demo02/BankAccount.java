package com.edu.nefu.practice02.demo02;

public class BankAccount {
    private int bandAccountId;
    private String date;
    private double rest;//余额
    private static int num=0;

    public BankAccount(String date, double rest) {
        this.bandAccountId=++num;
        this.date = date;
        this.rest = rest;
    }

    public BankAccount(int bandAccountId, String date, double rest) {
        this.bandAccountId = bandAccountId;
        this.date = date;
        this.rest = rest;
        num = this.bandAccountId;
    }

    public void bankIn(double amount) {
        this.rest = this.rest + amount;
        System.out.println("账号:"+this.bandAccountId+"成功入账:" + amount);
    }

    public void bankOut(double amount) {
        if (amount > rest) System.out.println("账号:"+this.bandAccountId+"余额不足");
        else {
            this.rest = this.rest - amount;
            System.out.println("账号:"+this.bandAccountId+"成功出账:" + amount);
        }
    }

    public int getBandAccountId() {
        return bandAccountId;
    }

    public String getDate() {
        return date;
    }

    public double getRest() {
        return rest;
    }
    public void toBankAccount(){
        System.out.println("账号:"+this.bandAccountId);
        System.out.println("创建时间:"+this.date);
        System.out.println("余额:"+this.rest);
    }
}

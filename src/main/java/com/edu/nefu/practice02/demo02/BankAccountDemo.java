package com.edu.nefu.practice02.demo02;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount01 = new BankAccount(20012,"2020/02/28",1200000);
        BankAccount bankAccount02 = new BankAccount("2020/02/28",880000);
        bankAccount01.bankIn(120000);
        bankAccount01.bankOut(600000);
        bankAccount02.bankIn(600000);
        bankAccount02.bankOut(200000);
        System.out.println("-----------------------");
        bankAccount01.toBankAccount();
        System.out.println("-----------------------");
        bankAccount02.toBankAccount();
    }
}

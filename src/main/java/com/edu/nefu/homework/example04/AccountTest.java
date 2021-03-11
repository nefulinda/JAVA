package com.edu.nefu.homework.example04;


public class AccountTest {
    public static void main(String[] args) {
        Customer customer01 = new Customer("Jane", "Smith", new Account(1000, 2000, 0.0123));
        Account account01 = new Account(1000, 2000, 0.0123);
        customer01.setAccount(account01);
        customer01.getAccount().withdraw(100);
        customer01.getAccount().withdraw(960);
        customer01.getAccount().withdraw(2000);
        customer01.printMessage();
        Account account = new Account(1122, 20000, 0.045);
        account.withdraw(30000);
        System.out.println("余额为:" + account.getBalance());
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("余额为:" + account.getBalance());
        System.out.println("年利率:" + account.getAnnualInterestRate());
        System.out.println("月利率:" + account.getMonthInterest());
        customer01.printMessage();
    }
}

package com.edu.nefu.practice.demo;

public class Demo02 {
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
        System.out.println("月利率:" + account.getMonthInterest());
//        CheckAccount account02 = new CheckAccount(1122,20000,0.045,5000);
//        account02.withdraw(5000);
//        System.out.println("账户余额:"+account02.getBalance());;
//        System.out.println("可透支余额:"+account02.getOverdraft());
//        System.out.println("---------------------");
//        account02.withdraw(18000);
//        System.out.println("账户余额:"+account02.getBalance());;
//        System.out.println("可透支余额:"+account02.getOverdraft());
//        System.out.println("---------------------");
//        account02.withdraw(3000);
//        System.out.println("账户余额:"+account02.getBalance());;
//        System.out.println("可透支余额:"+account02.getOverdraft());
    }
}

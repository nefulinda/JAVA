package com.edu.nefu.homework.example04;


public class Customer {
    private String firstName;
    private String lastName;
    private Account account;


    public Customer(String firstName, String lastName, Account account) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    public void printMessage(){
        System.out.println("Customer:"+lastName+","+firstName);
        System.out.println("has a account id is："+account.getId());
        System.out.println("balance is:"+account.getBalance());
        System.out.println("账户年利率为:"+account.getAnnualInterestRate());
    }
}

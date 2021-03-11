package com.edu.nefu.practice.test;

public class RabbitBreed {
    public static void main(String[] args) {
        int f1 =1;
        int f2 =1;
        int rabbitNumber=0;
        for (int i=3;i<=12;i++){
            rabbitNumber =f1+f2;
            f1=f2;
            f2=rabbitNumber;
        }
        System.out.println(rabbitNumber);
    }
}

package com.edu.nefu.practice.test;

public class ChickenRabbit {
    public static void main(String[] args) {
        int Chicken;
        int Rabbit;
        for (Chicken = 1;Chicken<50;Chicken++){
            for (Rabbit = 1;Rabbit<=50-Chicken;Rabbit++){
                if ((Chicken+Rabbit == 50)&& (Chicken *2+Rabbit*4 ==160)){
                    System.out.println("鸡有"+Chicken+"只; "+"兔子有"+Rabbit+"只\n");
                }
            }
        }
    }
}

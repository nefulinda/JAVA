package com.edu.nefu.practice.polymorphic;

public class Bus implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bus starts");
    }

    @Override
    public void stop() {
        System.out.println("Bus stops");
    }
}

package com.edu.nefu.practice.polymorphic;

public class Bike implements Vehicle{
    public Bike(){

    }
    @Override
    public void start(){
        System.out.println("Bike  starts");
    }

    @Override
    public void stop() {
        System.out.println("Bike stops");
    }
}

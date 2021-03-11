package com.edu.nefu.practice.polymorphic02;

public class DemoVehicle {
    public static void main(String[] args) {
        Car car  =new Car();
        Motorbike motorbike = new Motorbike();
        System.out.println(car.NoOfWheels());
        System.out.println(motorbike.NoOfWheels());

    }
}

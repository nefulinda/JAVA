package com.edu.nefu.practice.polymorphic;

public class VehicleDemo {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Bike bike = new Bike();
        bus.start();
        bus.stop();
        bike.start();
        bike.stop();
    }

}

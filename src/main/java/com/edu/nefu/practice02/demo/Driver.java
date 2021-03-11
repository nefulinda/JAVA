package com.edu.nefu.practice02.demo;

public class Driver implements CarDrive{
    private String name;
    private  Car car;
    public Driver(){

    }
    public Driver( String name, Car car) { this.name=name;
        this.car =car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        System.out.println(this.name+"在驾驶");
        car.run();
    }
}

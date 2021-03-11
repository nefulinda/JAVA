package com.edu.nefu.practice02.demo;

public class Car implements CarDrive{
    private  String brand;
    private  String name;
    public Car(){

    }
    public Car(String name,String brand){
        this.name=name;this.brand=brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println(this.name+"的车在跑");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

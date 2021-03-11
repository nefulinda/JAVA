package com.edu.nefu.practice.demo;

public class Vehicles {
    private String brand;
    private String color;

    public Vehicles() {

    }

    public Vehicles(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void run() {
        System.out.println("我已经开动了");
    }

    public void showInfo() {
        System.out.println("车子的商标" + brand);
        System.out.println("车子的颜色" + color);
    }
}

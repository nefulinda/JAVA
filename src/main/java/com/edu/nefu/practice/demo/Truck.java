package com.edu.nefu.practice.demo;

public class Truck extends Vehicles {
    private float load;

    public Truck() {

    }

    public Truck(float load) {
        this.load = load;
    }

    public Truck(String brand, String color, float load) {
        setBrand(brand);
        setColor(color);
        this.load = load;
    }

    public float getLoad() {
        return load;
    }

    public void setLoad(float load) {
        this.load = load;
    }

    public void showTruck() {
        super.showInfo();
        System.out.println("车子的载重" + load);
    }
}

package com.edu.nefu.practice.demo;

public class Car extends Vehicles {
    private int seats = 4;

    public Car() {

    }

    public Car(int seats) {
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Car(String brand, String color ,int seats) {
        super(brand, color);
        this.seats=seats;
    }

    public void showCar() {

      super.showInfo();
        System.out.println("车子的座位" + seats);
    }
}

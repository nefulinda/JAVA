package com.edu.nefu.practice.demo;

public class Vehicle {
    private int speed;
    private int distance;

    public Vehicle() {

    }

    public Vehicle(int speed, int distance) {
        this.speed = speed;
        this.distance = distance;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void move(int distance) {
        this.distance = distance + this.distance;
        if (this.distance < 0) System.out.println("移动距离有错误");
        else {
            System.out.println("移动距离为" + this.distance);
        }
    }

    public void setSSpeed(int speed) {
        System.out.println("速度为" + speed);
    }

    public void speedUp() {
        speed = speed + 1;
        System.out.println("加速后速度为" + speed);
    }

    public void speedDown() {
        speed = speed - 1;
        System.out.println("减速后速度为" + speed);
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.setSpeed(120);
        System.out.println("速度为"+car.getSpeed()) ;
        car.move(3000);
        car.speedUp();
    }
}

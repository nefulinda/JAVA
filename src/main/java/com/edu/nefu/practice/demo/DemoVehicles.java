package com.edu.nefu.practice.demo;

public class DemoVehicles {
    public static void main(String[] args) {
        Vehicles vehicles01 =new Vehicles("QQ","black");
        Car  car01 = new Car("MM","red",4);
        Truck truck01 = new Truck("ZZ","white",600);
        vehicles01.showInfo();
        car01.showCar();
        car01.run();
        truck01.showTruck();
    }
}

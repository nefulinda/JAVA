package com.edu.nefu.practice.polymorphic02;

public class Dog extends Pet {
    public Dog(String name) {
        this.name = name;
    }

    public void follow() {
        System.out.println("Dog is following");
    }
}

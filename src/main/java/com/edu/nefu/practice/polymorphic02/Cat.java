package com.edu.nefu.practice.polymorphic02;

public class Cat extends Pet{
    public Cat(String name) {
        this.name=name;
    }

    public void follow(){
        System.out.println("Cat is following");
    }
}

package com.edu.nefu.practice.polymorphic02;

public class Hero {
    private String name;
    protected Pet pet;
    public Hero(){

    }

    public Hero(String name) {
        this.name = name;
    }

    public Hero(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }
    public  void run(){
        System.out.println("Hero runs");
        pet.follow();
    }
}

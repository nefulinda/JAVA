package com.edu.nefu.practice.polymorphic02;

public class Eagle extends Pet{
    public Eagle(String name) {
        this.name=name;
    }
    public void follow(){
        System.out.println("Ealge is following");
    }
}

package com.edu.nefu.practice.polymorphic02;

public class Pet {
    protected String name;

    public Pet(){

    }

    public Pet(String name) {
        this.name = name;
    }
    //    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Pet(String name) {
//        this.name = name;
//    }

    public void follow(){
        System.out.println("Pet is following");
    }
}

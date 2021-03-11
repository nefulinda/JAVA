package com.edu.nefu.practice02.demo;

public class General {
    private String name;

    public General() {

    }

    public General(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getHurt(Weapon weapon) {
        System.out.print(this.name+"使用");
        weapon.hurt();
    }
}

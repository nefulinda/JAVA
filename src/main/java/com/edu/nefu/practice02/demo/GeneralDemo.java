package com.edu.nefu.practice02.demo;

public class GeneralDemo {
    public static void main(String[] args) {
        General general = new General("Tom");
        Kinfe kinfe =new Kinfe();
        general.getHurt(kinfe);
        System.out.println("--------------------------");
        Spear spear = new Spear();
        general.getHurt(spear);
        System.out.println("---------------------------");
        Bow bow = new Bow();
        general.getHurt(bow);
    }
}

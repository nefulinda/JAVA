package com.edu.nefu.practice.demo;

public class HeroDemo {
    public static void main(String[] args) {
        Hero hero01 = new Hero("Jack",1,1);
        hero01.toHero();
        hero01.hurt(10);
        hero01.hurt(hero01,92);
    }
}

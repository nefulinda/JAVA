package com.edu.nefu.practice.polymorphic02;

public class DemoPet {
    public static void main(String[] args) {
        Pet pet = new Cat("lala");
        Hero hero = new Hero("Tom",pet);
      //  Pet  pet = new Pet();
         hero.run();
    }
}

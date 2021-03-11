package com.edu.nefu.practice.polymorphic;

public class DemoAnimal {
    public static void main(String[] args) {
        Animal a = new Cat();
        Animal b = new Dog();
        Animal c = new Eagle();
        Cat cat = (Cat) a;//downcast
        a.eat();
        b.eat();
        c.eat();
        cat.eat();
        System.out.println("-----------------");
        a.sing();
        b.sing();
        c.sing();
        cat.sing();
        System.out.println("-----------------");
        System.out.println(a instanceof Cat);
        System.out.println(b instanceof Dog);
        System.out.println(c instanceof Animal);
        System.out.println("-----------------");

    }
}

package com.edu.nefu.practice02.demo02;

public class MyArrayDemo {
    public static void main(String[] args) {
        MyArray myArray01 = new MyArray();
        myArray01.add(56);
        myArray01.add(2);
        myArray01.add(3);
        myArray01.add(4);
        myArray01.add(5);
        myArray01.add(6);
        myArray01.add(3,5);
        System.out.println(myArray01.getNum());
        myArray01.get(2);
        myArray01.remove(2);
        myArray01.get(2);
        myArray01.set(2,99);
        myArray01.get(2);
        myArray01.remove(9);
        myArray01.get(10);
    }
}

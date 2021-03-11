package com.edu.nefu.practice.demo;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box() {

    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double volume() {
        return length * width * height;
    }

    public double superficialArea() {
        return length * width * 2 + width * height * 2+length*height*2;
    }

}

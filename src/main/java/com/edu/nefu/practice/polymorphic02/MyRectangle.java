package com.edu.nefu.practice.polymorphic02;

public class MyRectangle extends GeometricObject {
    private double width;
    private double height;

    public MyRectangle() {

    }

    public MyRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public MyRectangle(String color, double weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double  findArea(){
       return height*width;
    }
}

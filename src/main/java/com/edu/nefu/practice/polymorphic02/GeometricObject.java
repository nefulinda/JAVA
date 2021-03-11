package com.edu.nefu.practice.polymorphic02;

public class GeometricObject {
    private String color;
    private double weight;

    public GeometricObject() {

    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double findArea() {
        return 0;
    }
    public boolean equalsArea( GeometricObject geometric){
      return findArea()==geometric.findArea();
    }//动态绑定实现
    public void displayGeometricObject(){
        System.out.println("面积:"+findArea());
    }
}

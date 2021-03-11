package com.edu.nefu.practice.polymorphic02;

public class DemoGeometricObject {
    public static void main(String[] args) {
      MyRectangle rectangle = new MyRectangle("red",20,2,6);
      Circle circle = new Circle("white",18,3);
        System.out.println(rectangle.equalsArea(circle));
        rectangle.displayGeometricObject();
        circle.displayGeometricObject();
    }
}

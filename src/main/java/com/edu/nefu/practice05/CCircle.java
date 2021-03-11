package com.edu.nefu.practice05;

public class CCircle {
    public static void main(String[] args) {

       try {
           System.out.println( circleArea(-1));
       } catch (CircleException e){
           System.out.println("圆的半径不能为负数");
           e.printStackTrace();
       }
    }

    static double circleArea(double radius) throws CircleException {
        if (radius < 0) {
            throw new CircleException();
        } else {
            return Math.PI * Math.PI * radius;
        }
    }

}

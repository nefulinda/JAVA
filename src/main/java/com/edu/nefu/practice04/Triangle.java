package com.edu.nefu.practice04;

public class Triangle {
    private  int x,y,z;

    public Triangle(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    void getArea(){
        System.out.println(Math.sqrt((double)(x+y+z)/2)*((double)(x+y+z)/2-x)*((double)(x+y+z)/2-y)*((double)(x+y+z)/2-z));
    }
    void shouInfo(){
        System.out.println("三边的长分别为:"+x+","+y+","+z);
    }

}

package com.edu.nefu.practice.demo;

public class TheGreatWall {
    private int leng=10000;
    private  static  TheGreatWall instance;
    private TheGreatWall(){

    }

    public int getLeng() {
        return leng;
    }

    public static TheGreatWall getInstance(){
        if (instance==null) {
            instance= new TheGreatWall();
        }
        return instance;
    }
}

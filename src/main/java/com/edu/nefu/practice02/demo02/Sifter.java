package com.edu.nefu.practice02.demo02;

import java.util.Random;

public class Sifter {
    private  int sifterNumber = 6;
    private  int ponit;
    private  int num;
    public Sifter(){

    }

    public Sifter(int sifterNumber, int ponit, int num) {
        this.sifterNumber = sifterNumber;
        this.ponit = ponit;
        this.num = num;
    }

    public int getSifterNumber() {
        return sifterNumber;
    }

    public int getPonit() {
        return ponit;
    }

    public int getNum() {
        return num;
    }
    public int roll(){
         num =new Random().nextInt(6)+1;;
         ponit = num;
         return this.num;
    }
}

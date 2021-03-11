package com.edu.nefu.practice.demo;

public class WuMingFen {
    String theMa;
    int quantity;
    boolean likeSoup;
    public  WuMingFen(){

    }
    public  WuMingFen(String theMa,int quantity,boolean likeSoup){
        this.likeSoup =likeSoup;
        this.quantity =quantity;
        this.theMa =theMa;
    }
    public   WuMingFen(String theMa){
        this(theMa,3,true);
    }
    public WuMingFen(String theMa,int quantity){
        this(theMa,quantity,true);
    }

    public String getTheMa() {
        return theMa;
    }

    public void setTheMa(String theMa) {
        this.theMa = theMa;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isLikeSoup() {
        return likeSoup;
    }

    public void setLikeSoup(boolean likeSoup) {
        this.likeSoup = likeSoup;
    }
    void  check(){
        System.out.println( theMa+" "+quantity+" "+likeSoup);
    }

    public static void main(String[] args) {
        WuMingFen f1 = new WuMingFen("牛肉",3,true);
        WuMingFen f2 = new WuMingFen("牛肉",2);
        WuMingFen f3 = new WuMingFen();
        f3.setTheMa("酸辣面");
        f3.setQuantity(2);
        f3.setLikeSoup(true);
        f1.check();
        f2.check();
        f3.check();
    }
}

package com.edu.nefu.practice05;

public class ThrowDemo01 {
    public static void main(String[] args) {

        try {
            double sum= divMethod(23,0);
            System.out.println(sum);
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("除数不能为零");
        }
        finally {
            System.out.println("运算结束");
        }
//        int[] arr = new int[1];
//        try {
//            arr[2] = 3;
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("index out of bound!");
//            e.printStackTrace();
//        }finally {
//            System.out.println("加油");
//        }

    }
    static double divMethod(double a,double b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("b作为除数不能为零");
        }
        else {
            return a/b;
        }
    }
}

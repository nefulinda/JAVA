package com.edu.nefu.practice04;

import java.util.Scanner;

public class Eaxmple03 {
    public static void main(String[] args) {
        Scanner scan=new  Scanner(System.in);
        int a,b,c;
        a= scan.nextInt();
        b= scan.nextInt();
        c= scan.nextInt();
        try {
            if ((a+b)>c&&(a+c)>b&&(b+c)>a){
                Triangle triangle =new Triangle(a,b,c);
                triangle.getArea();
                triangle.shouInfo();
            }
         else {
             throw new NotTriangleException();
            }
        }catch (NotTriangleException e){
            System.out.println("不能构成三角形");
        }
    }
}

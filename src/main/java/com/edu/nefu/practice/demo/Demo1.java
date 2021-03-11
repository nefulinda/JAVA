package com.edu.nefu.practice.demo;

import java.util.Scanner;

public class Demo1 {
    //1+2+3+......递归
    public static int recursion01(int n) {
         if (n < 0) {
            return 0;
        } else {
            return n + recursion01(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;//总数
        sum = recursion01(n);
        System.out.println(sum);
//        int x,y,i;
//        i=0;
//        x=i++;//i++ i先赋值后运算
//        i=0;
//        y=++i;//++i  i先运算后赋值
//        System.out.println(x+"\t"+y);
//        Box box = new Box(16.0, 45, 20);
//        System.out.println("立方体的体积是" + box.volume());
//        System.out.println("立方体的表面积是" + box.superficialArea());
//        Hero hero =new Hero();
//        hero.setName("多多");
//        hero.go();
//        hero.eat(10);
//        hero.hurt();
//        hero.eat(100);
//        for (int i=0;i<11;i++)
//            hero.hurt();
        // SingleObject.getInstance().showMessage();
    }
}

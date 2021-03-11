package com.edu.nefu.practice.test;



import static java.lang.Math.sqrt;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 300;
        int number01 = 400;
        for (; number <= number01; number++) {
            boolean flag = false;//假设全是素数
            for (int i = 2; i <= sqrt(number); i++) {
                if (number % i == 0) {
                    flag = true;//不是素数改变flag值
                    break;
                }
            }
            //Math.PI 代表数学中的π
            //输出素数
            if (flag == false) {
                System.out.println(number + "是素数\n");
            }
        }
        //System.out.printf();间接实现小数的位数; printf是C语言中的输出

    }
}

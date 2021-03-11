package com.edu.nefu.practice.demo;

public class Calculator {
    void add(double a, double b) {
        System.out.println("两者相加得" + (a + b));
    }

    void minus(double a, double b) {
        System.out.println("两个数的差为：" + (a - b));
    }

    void multiply(double a, double b) {
        System.out.println("两个数的积为：" + (a * b));
    }

    void divide(double a, double b) {
        System.out.println("两个数的商为：" + (a / b));
    }

    void square(double a) {
        if (a < 0) a = -a;
        System.out.println(a + "的平方得数为" + a * a);
    }

    void factorial(int a) {
        int sum = 1;
        for (int i = 1; i <= a; i++)
            sum = i * sum;
        System.out.println(a + "的阶乘得数为" + sum);
    }

    void exponentiation(double a, int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= a;
        }
        System.out.println(a + "的" + n + "次幂为：" + sum);
    }

    void accumulate(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("累加结果为：" + sum);
    }

    void primeNumber(int a) {
        boolean prime = true;
        if (a == 2) {
            System.out.println(a + "是素数");
        } else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    prime = false;
                }
            }
            if (prime == false) {
                System.out.println(a + "不是素数");
            } else {
                System.out.println(a + "不是素数");
            }
        }
    }
}

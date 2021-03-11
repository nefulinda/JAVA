package com.edu.nefu.practice02.demo02;

public class Stu {
    private int sno;//学号
    private String name;
    private int deg;//成绩
    private static double sum = 0;//总分
    private static int num = 0;//人数

    public Stu() {
        num++;
    }

    public Stu(int sno, String name, int deg) {
        this.sno = sno;
        this.name = name;
        this.deg = deg;
        num++;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeg() {
        return deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }

    public void disp() {
      //  if (this.deg >= 80 && this.deg < 90) {
            System.out.println("学号:" + this.sno);
            System.out.println("姓名:" + this.name);
            System.out.println("成绩:" + this.deg);
       // }
    }

    public static double avg(Stu stu) {
        sum = sum + stu.deg;
        return sum / num;
    }
}

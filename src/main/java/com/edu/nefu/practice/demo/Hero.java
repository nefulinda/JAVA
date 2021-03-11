package com.edu.nefu.practice.demo;

public class Hero {
    private int power = 100;
    private String name;
    private int grade = 1;

    public Hero() {}

    public Hero(String name, int grade, int type) {
        this.name = name;
        this.grade = grade;
        for (int i=1;i<type;i++){
            if (type<999)
            this.power = power+100;
        }
    }

    public int getGrade() { return grade; }

    public void setGrade(int grade) { this.grade = grade; }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void go() {
        if (power <= 0) {
            System.out.println("不能行走，此英雄已死亡");
        } else {
            power = power - 1;
        }
        System.out.println(name + ":" + power);
    }

    public void eat(int n) {
        power = power + n;
        if (power > 100) {
            power = 100;
        }
        System.out.println(name + ":" + power);
    }

    public void hurt(int n) {
        power = power - n;
        if (power <= 0) {
            System.out.println(name+"此英雄已死亡");
            power = 0;
        } else {
            System.out.println(name+"受攻击，生命值减少10");
            System.out.println(name + ":" + power);
        }
    }
  public void toHero(){
      System.out.println("姓名:"+name);
      System.out.println("等级:"+grade);
      System.out.println("生命值:"+power);
  }

    public void hurt(Hero hero) {
        System.out.println(hero.name+"受攻击，生命值减少100");
        hero.power= hero.power-100;
        if (hero.power <= 0) {
            System.out.println(hero.name+"此英雄已死亡");
            hero.power = 0;
        } else {
            System.out.println(hero.name + ":" + power);
        }
        hero.toHero();
    }
    public void hurt(Hero hero ,int n) {
        System.out.println(hero.name+"受攻击，生命值减少"+n);
        hero.power= hero.power-n;
        if (hero.power <= 0) {
            System.out.println(hero.name+"此英雄已死亡");
            hero.power = 0;
        } else {
            System.out.println(hero.name + ":" + power);
        }
        hero.toHero();
    }
}

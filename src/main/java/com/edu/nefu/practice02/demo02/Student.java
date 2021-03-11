package com.edu.nefu.practice02.demo02;

public class Student extends Person{
    private int math;
    private int English;
    private int  Verbal;
    private int physics;
    private int chemistry;
    public Student(){
    }

    public Student(int math, int english, int verbal, int physics, int chemistry) {
        this.math = math;
        English = english;
        Verbal = verbal;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public Student(String name, int age, String sex, int math, int english, int verbal, int physics, int chemistry) {
        super(name, age, sex);
        this.math = math;
        English = english;
        Verbal = verbal;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    public int getVerbal() {
        return Verbal;
    }

    public void setVerbal(int verbal) {
        Verbal = verbal;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }
    public void toStudent(){

        System.out.println("数学:"+math);
        System.out.println("语文:"+Verbal);
        System.out.println("物理:"+physics);
        System.out.println("英语:"+English);
        System.out.println("化学:"+chemistry);
    }
}

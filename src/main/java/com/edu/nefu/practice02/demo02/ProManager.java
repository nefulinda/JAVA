package com.edu.nefu.practice02.demo02;

public class ProManager {
    private static ProManager instance;

    private ProManager() {
    }

    static ProManager getintace() {
        if (instance == null) {
            instance = new ProManager();
        }
        return instance;
    }

    public static void main(String[] args) {
        ProManager proManager01 = getintace();
        ProManager  proManager02 = getintace();
        if (proManager01.equals(proManager02)){
            System.out.println("只有一个进程");
        }
        else{
            System.out.println("不止一个进程");
        }
    }
}

package com.edu.nefu.practice02.demo02;

public class DicDemo {
    public static void main(String[] args) {
        Dic dic = new Dic();
        dic.add("word","单词，字");
        dic.add("a","一，一个，表数目的名词");
        dic.add("world","世界");
        dic.add("sun","太阳，恒星");
        dic.add("star","星星，行星");
        dic.add("face","脸，脸面");
        dic.trans("face");
        dic.trans("sun");
        dic.add("sun","太阳");
    }
}

package com.edu.nefu.inner;

public class EaxmpleTest {
    public static void main(String[] args) {
        Eaxmple07 outEaxmple = new Eaxmple07();
        Eaxmple07.InnerMethod outIner = outEaxmple.new InnerMethod();
            outIner.innerMethod();
            outEaxmple.outerMethod();

    }
}

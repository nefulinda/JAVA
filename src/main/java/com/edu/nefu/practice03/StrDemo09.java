package com.edu.nefu.practice03;

public class StrDemo09 {
    static void procedure()
    {
        try
        {
            int c[]={1};
            c[42]=99;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("数组超越界限异常："+e);
        }
    }
    public static void main(String args[])
    {
        try
        {
            procedure();
            int a=args.length;
            int b=42/a;
            System.out.println("b="+b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("除0异常："+e);
        }
    }


}

package com.edu.nefu.inner;

public class Eaxmple07 {
    private String name = "wwwww";

    public void outerMethod() {
        InnerMethod inc = new InnerMethod();
       // inc.innerMethod();
        System.out.println("外部类的方法执行");
        System.out.println("外部类中使用外部类的属性" + name);
        System.out.println("外部类中使用内部类的属性"+inc.name);
    }

    //成员内部类
    public class InnerMethod {
        private String name = "zhangfei";

        public void innerMethod() {
            System.out.println("内部类中使用内部类的属性" + name);
            System.out.println("内部类中使用外部类的属性"+Eaxmple07.this.name);
            System.out.println("内部类的方法执行");
        }
    }
}

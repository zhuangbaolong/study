package com.codeblock;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        BB aa = new BB();
        System.out.println(Cat.n1);

    }
}
class AA{
    static {
        System.out.println("AA 静态代码块被调用。");
    }
}
class BB extends AA{
    static {
        System.out.println("BB 静态代码块被调用。");
    }
}
class Cat{
    public static int n1 = 99;
    static {
        System.out.println("Cat 静态代码块被调用。");
    }
}

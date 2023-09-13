package com.codeblock;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        BB3 bb = new BB3();
    }
}
class AA3{
    {
        System.out.println("AA3静态代码块");
    }
    public AA3(){
        super();
        System.out.println("AA3构造器被调用");
    }
}
class BB3 extends AA3{
    {
        System.out.println("BB3静态代码块");
    }
    public BB3(){
        super();
        System.out.println("BB3构造器被调用");
    }
}

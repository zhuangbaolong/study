package com.codeblock;

public class CodeBlock {
    public static void main(String[] args) {
        Movice movice = new Movice("你好，李焕英");
        System.out.println("----------------");
        Movice movice1 = new Movice("唐探3", 100, "陈思成");
    }
}

class Movice{
    private String name;
    private double price;
    private String director;
    //3 个构造器-》重载
    //(1) 下面的三个构造器都有相同的语句
    //(2) 这样代码看起来比较冗余
    //(3) 这时我们可以把相同的语句，放入到一个代码块中，即可
    //(4) 这样当我们不管调用哪个构造器，创建对象，都会先调用代码块的内容
    //(5) 代码块调用的顺序优先于构造器..
    //相同的要执行的语句放代码块中
    {
        System.out.println("电影屏幕打开...");
        System.out.println("广告开始...");
        System.out.println("电影正式开始...");
    }

    public Movice(String name) {
        System.out.println("Moice(String name) 被调用...");
        this.name = name;
    }

    public Movice(String name, double price, String director) {
        System.out.println("Moice(String name, double price, String director) 被调用...");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}

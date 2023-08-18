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

    //共同代码块
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

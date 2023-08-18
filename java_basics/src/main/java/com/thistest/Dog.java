package com.thistest;

public class Dog {
    public String name;
    public int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void info(){
        System.out.println(name+"\t"+age+"\t"+"当前对象是："+this.hashCode());
    }
}

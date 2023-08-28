package com.collection;

import java.util.ArrayList;

public class Generic {
    public static void main(String[] args) {
//使用传统的方法来解决===> 使用泛型
        //老韩解读
        //1. 当我们 ArrayList<Dog> 表示存放到 ArrayList 集合中的元素是Dog类型 (细节后面说...)
        //2. 如果编译器发现添加的类型，不满足要求，就会报错
        //3. 在遍历的时候，可以直接取出 Dog 类型而不是 Object
        //4. public class ArrayList<E> {} E称为泛型,那么 Dog->E
        ArrayList<Dog2> arrayList = new ArrayList<Dog2>();
        arrayList.add(new Dog2("旺财", 10));
        arrayList.add(new Dog2("发财", 1));
        arrayList.add(new Dog2("小黄", 5));
        //假如我们的程序员，不小心，添加了一只猫
//        arrayList.add(new Cat("招财猫", 8));
        System.out.println("===使用泛型====");
        for (Dog2 dog : arrayList) {
            System.out.println(dog.getName() + "-" + dog.getAge());
        }
    }
}
class Dog2<E> {
    private String name;
    private int age;
    public Dog2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //省略getter、setter方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Cat { //Cat类
    private String name;
    private int age;
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //省略getter、setter方法
}

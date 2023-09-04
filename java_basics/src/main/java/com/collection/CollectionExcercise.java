package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExcercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog11("小黑",3));
        list.add(new Dog11("大黄",5));
        list.add(new Dog11("大壮",8));

        //for循环增强
        for (Object dog : list) {
            System.out.println(dog);
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object dog = iterator.next();
            System.out.println(dog);
        }
    }
}
class Dog11 {
    private String name;
    private int age;

    public Dog11(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "Doga{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

package com.design_mode;

//懒汉式的单例模式
public class SingleTon02 {
    public static void main(String[] args) {
        Cat instance = Cat.getInstance();
        System.out.println(instance);
        Cat instance2 = Cat.getInstance();
        System.out.println(instance2);
        System.out.println(instance == instance2);
    }
}
class Cat{
    private String name;
    public static int n1 = 999;
    private static Cat cat;

    public Cat(String name) {
        this.name = name;
    }

    public static Cat getInstance(){
        if (cat == null){
            cat = new Cat("小猫");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}

package com.innerclass;

//匿名内部类
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04 {//外部类
    private int n1 = 100;

    public void method() {
        IA tiger = new IA() {
            @Override
            public void sry() {
                System.out.println("老虎");
            }
        };
        System.out.println("tiger的运行类型是: " + tiger.getClass());
        tiger.sry();
        tiger.sry();
        tiger.sry();
        Father father = new Father("jack") {
            //匿名内部类重写test方法
            @Override
            public void test() {
                System.out.println("匿名内部类重写test方法");
            }
        };
        System.out.println("father运行类型=" + father.getClass());
        father.test();
        Animal animal = new Animal() {
            @Override
            void eat() {
                System.out.println("小狗吃骨头");
            }
        };
        animal.eat();
    }
}

interface IA {//接口

    public void sry();
}

class Father {
    public Father(String name) {
        System.out.println("father name=" + name);
    }

    public void test() {
        System.out.println("测试");
    }
}

abstract class Animal {
    abstract void eat();
}

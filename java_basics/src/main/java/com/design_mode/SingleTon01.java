package com.design_mode;

//饿汉式的单例模式
public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
        GirlFriend instance2 = GirlFriend.getInstance();
        System.out.println(instance2);
        System.out.println(instance == instance2);
    }
}

class GirlFriend {
    private String name;

    //为了能够在静态方法中，返回gf对象，需要将其修饰为static。类加载这个方法执行一次创建好=》饿汉式
    private static GirlFriend gf = new GirlFriend("小红红");

    /*
    单例模式-饿汉式
    1. 将构造器私有化
    2. 在类的内部直接创造对象（该对象是static）
    3. 提供一个公共的static方法，返回gf
     */
    private GirlFriend(String name) {
        System.out.println("构造器");
        this.name = name;
    }

    public static GirlFriend getInstance() {
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}

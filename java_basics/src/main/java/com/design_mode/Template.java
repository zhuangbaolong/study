package com.design_mode;

//抽象类-模板设计模式
abstract public class Template {
    public abstract void job();//抽象方法

    public void calculateTime() {
        long startTime = System.currentTimeMillis();
        job();
        long endTime = System.currentTimeMillis();
        System.out.println("执行时间：" + (endTime - startTime));
    }
}

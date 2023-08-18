package com.final_;

public class FinalDetail {
    public static void main(String[] args) {
        System.out.println(BB.num);
    }
}
//final 和 static 往往搭配使用，效率更高，不会导致类加载.底层编译器做了优化处理
class BB{
    public final static int num = 100;
    static {
        System.out.println("BB 静态代码块被执行");
    }
}

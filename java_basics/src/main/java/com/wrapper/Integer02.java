package com.wrapper;

public class Integer02 {
    public static void main(String[] args) {
//        Integer i1 = new Integer(1);
//        Integer j1 = new Integer(1);
//        System.out.println(i1 == j1);
//        Integer i = new Integer(128);
//        Integer j = new Integer(128);
//        System.out.println(i == j);
//        Integer a = 1;
//        Integer b = 1;
//        System.out.println(a == b);
//        Integer m = 128;
//        Integer n = 128;
//        System.out.println(m == n);

        Integer a1 = new Integer(127);
        Integer b1 = new Integer(127);
        System.out.println(a1==b1);
        Integer a2 = 127;
        Integer b2 = 127;
        System.out.println(a2==b2);
        Integer a3 = 127;//=new Integer(127)
        Integer b3 = new Integer(127);
        System.out.println(a3==b3);
        Integer a4 = 127;
        int b4 = 127;
        System.out.println(a4==b4);
        Integer a5 = 128;
        int b5 = 128;
        System.out.println(a5==b5);
    }
}

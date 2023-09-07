package com.wrapper.string;

//类型转换
public class WarpperVSString {
    public static void main(String[] args) {
        //包装类(Integer)->String
        Integer i = 100;
        //1
        String str1 = i+"";
        //2
        String str2 = i.toString();
        //3
        String str3 = String.valueOf(i);
        //String -> Integer
        String str4 = "1234";
        Integer i2 = Integer.parseInt(str4);
        Integer i3 = new Integer(str4);
        Integer i4 = Integer.valueOf(str4);
        System.out.println(i2 instanceof Integer);
        System.out.println(i3 instanceof Integer);
        System.out.println(i4 instanceof Integer);
    }
}

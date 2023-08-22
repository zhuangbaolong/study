package com.wrapper.exercise;

public class StringBufferExcercise02 {
    public static void main(String[] args) {
        /*
        思路分析
        1. 定义一个Scanner 对象，接收用户输入的 价格(String)
        2. 希望使用到 StringBuffer的 insert ，需要将 String 转成 StringBuffer
        3. 然后使用相关方法进行字符串的处理
        代码实现
         */
        String  price = "81234564.88";
        StringBuffer stringBuffer = new StringBuffer(price);
        for (int i = stringBuffer.lastIndexOf(".")-3;i>0;i-=3){
            stringBuffer = stringBuffer.insert(i,",");
        }
        System.out.println(stringBuffer);
    }
}

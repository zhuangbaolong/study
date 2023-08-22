package com.wrapper.exercise;


public class StringBufferExcercise {
    public static void main(String[] args) {
        String str = null;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer);

        StringBuffer stringBuffer1 = new StringBuffer(str);
        System.out.println(stringBuffer1);
    }
}

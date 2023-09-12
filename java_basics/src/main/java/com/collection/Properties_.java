package com.collection;

import java.util.Properties;

public class Properties_ {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("john",100);
        properties.put("lucy",100);
        properties.put("lic",100);
        //修改
        properties.put("lic",88);
        System.out.println(properties);
        //通过k得到v
        System.out.println(properties.get("lic"));
        //remove
        properties.remove("john");
        System.out.println(properties);
    }
}

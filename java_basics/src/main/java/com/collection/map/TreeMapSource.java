package com.collection.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapSource {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //按照字符串长度比较大小排序
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        treeMap.put("jack", "jieke");
        treeMap.put("tom", "汤姆");
        treeMap.put("kristina", "克瑞斯提诺");
        treeMap.put("smith", "斯密斯");
        treeMap.put("hsp", "韩顺平");//加入不了
        System.out.println("treemap=" + treeMap);
    }
}

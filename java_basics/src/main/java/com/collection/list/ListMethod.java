package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("张三丰");
        list.add("贾宝玉");
        //在index=1的位置插入
        list.add(1,"hhh");
        System.out.println("list="+list);
        //addAll
        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("tom");
        list.addAll(1, list2);
        System.out.println("list=" + list);
        //indexOf,返回obj在集合中首次出现的位置
        System.out.println(list.indexOf("tom"));
        //lastIndexOf
        System.out.println(list.lastIndexOf("hhh"));
        //remove
        list.remove(0);
        list.remove("hhh");
        System.out.println(list);
        list.set(2,"jia");
        System.out.println(list);
        //sublist返回子集合
        List list1 = list.subList(0, 1);//jack
        System.out.println("returnList:"+list1);
    }
}

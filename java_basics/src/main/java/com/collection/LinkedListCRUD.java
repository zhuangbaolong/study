package com.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCRUD {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("linkedList=" + linkedList);

        //演示一个删除结点的
//        linkedList.remove();// 这里默认删除的是第一个结点
        linkedList.remove(2);
        System.out.println("linkedList=" + linkedList);

        //修改某个结点对象
        linkedList.set(1,999);
        System.out.println("linkedList=" + linkedList);

        //得到某个结点对象
        //get(1) 是得到双向链表的第二个对象
        Object o = linkedList.get(1);
        System.out.println(o);//999

        //因为LinkedList 是 实现了List接口, 遍历方式
        System.out.println("===LinkeList遍历迭代器====");
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("next"+next);
        }
        System.out.println("===LinkeList遍历增强for====");
        for (Object o1 : linkedList) {
            System.out.println("o1:"+o1);
        }
        System.out.println("===LinkeList遍历普通for====");
        for (int i = 0; i <linkedList.size(); i++) {
            System.out.println(linkedList.get(i));

        }
    }
}

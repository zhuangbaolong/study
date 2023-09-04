package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(new Book("三国演义", "罗贯中", 10.1));
        collection.add(new Book("小李飞刀", "古龙", 5.1));
        collection.add(new Book("红楼梦", "曹雪芹", 34.6));
        //遍历 col集合
        Iterator iterator = collection.iterator();
        //快捷键itit,ctrl+j提示
        while (iterator.hasNext()) {
            //编译类型,运行类型是book
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}


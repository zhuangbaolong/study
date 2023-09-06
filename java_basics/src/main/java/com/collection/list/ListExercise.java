package com.collection.list;

import com.collection.Book;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(new Book("红楼梦", "曹雪芹", 100));
        list.add(new Book("西游记", "吴承恩", 50));
        list.add(new Book("水浒传", "施耐庵", 110));
        list.add(new Book("三国演义", "罗贯中", 10));

        for (Object book : list) {
            System.out.println(book);
        }
        sort(list);
        System.out.println("======排序后=======");
        for (Object book : list) {
            System.out.println(book);
        }
    }

    //静态方法
    public static void sort(List list) {
        //冒泡排序:价格从小到大
        int listSize = list.size();
        for (int i = 0; i < listSize; i++) {
            for (int j = i; j < listSize - i - 1; j++) {
                //取出对象Book
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j+1);
                if (book1.getPrice()> book2.getPrice()){
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }
    }
}


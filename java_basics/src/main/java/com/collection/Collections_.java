package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Clloections工具类
public class Collections_ {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("tom");
        list.add("smith");
        list.add("king");
        list.add("milan");
        list.add("tom");
        list.add("tom");
        //反转list元素的顺序
        Collections.reverse(list);
        System.out.println(list);
        //自然排序
        Collections.sort(list);
        System.out.println(list);
        //        shuffle(List)：对 List 集合元素进行随机排序
//        for (int i = 0; i < 5; i++) {
//            Collections.shuffle(list);
//            System.out.println("list=" + list);
//        }
        //自定义排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if ((o1 instanceof String) && (o2 instanceof String)){
                    return o2.length() - o1.length();
                }
                return 0;
            }
        });
        System.out.println("按字符串长度大->小排序");
        System.out.println(list);
        //自然排序最大的
        System.out.println(Collections.max(list));
        //复制到另一个list
        ArrayList dest = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            dest.add("");
        }
        Collections.copy(dest,list);
        System.out.println("复制后的dest:"+dest);
        //替换,  把tom都换成汤姆
        Collections.replaceAll(list,"tom","汤姆");
        System.out.println("替换后的list:"+list);
    }
}

package com.collection.map;

import java.util.*;

//Map接口遍历
public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put("邓超", "孙俪");
        map.put("王宝强", "马蓉");
        map.put("宋喆", "马蓉");
        map.put("刘令博", null);
        map.put(null, "刘亦菲");
        map.put("鹿晗", "关晓彤");
        //第一组: 先取出 所有的Key , 通过Key 取出对应的Value
        Set keySet = map.keySet();
        //增强for
        System.out.println("--------------第一种增强for遍历");
        for (Object key : keySet) {
            Object value = map.get(key);
            System.out.println(key+" = "+value);
        }
        //迭代器
        System.out.println("--------------第二种迭代器遍历");
        Iterator iterator = keySet.iterator();
        while(iterator.hasNext()){
            Object key = iterator.next();
            System.out.println(key+" = "+map.get(key));
        }

        //第二组:只能把所有的values取出
        Collection values = map.values();
        //增强for
        System.out.println("--------------第一种增强for遍历");
        for (Object value : values) {
            System.out.println(value);
        }
        //迭代器
        System.out.println("--------------第二种迭代器遍历");
        Iterator iterator2 = values.iterator();
        while(iterator2.hasNext()){
            Object value = iterator2.next();
            System.out.println(value);
        }

        //第三组：通过EntrySet来获取k-v
        Set entrySet = map.entrySet();
        System.out.println("----使用EntrySet 的 for增强(第3种)----");
        for (Object entry : entrySet) {
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey()+" - "+m.getValue());
        }
        System.out.println("----使用EntrySet 的 迭代器(第4种)----");
        Iterator iterator3 = entrySet.iterator();
        while (iterator3.hasNext()) {
            Object entry = iterator3.next();
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + " - "+m.getValue());
        }
    }
}

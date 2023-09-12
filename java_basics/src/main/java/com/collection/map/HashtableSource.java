package com.collection.map;

import java.util.Hashtable;

public class HashtableSource {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable<>();
        hashtable.put("john",100);
        hashtable.put("lucy",100);
        hashtable.put("lic",100);
        hashtable.put("lucy",80);
        hashtable.put("hello1",10);
        hashtable.put("hello2",10);
        hashtable.put("hello3",10);
        hashtable.put("hello4",10);
        hashtable.put("hello5",10);
        hashtable.put("hello6",10);
        System.out.println(hashtable);
    }
}

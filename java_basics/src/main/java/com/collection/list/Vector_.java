package com.collection.list;

import java.util.Vector;

public class Vector_ {
    public static void main(String[] args) {
        Vector vector = new Vector(8);
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        vector.add(100);
        System.out.println("vector=" + vector);
    }
}

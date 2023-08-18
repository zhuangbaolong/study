package com.hashcode;

public class HashCode_ {
    public static void main(String[] args) {
        AA a = new AA();
        AA a2 = new AA();
        AA a3 = a;
        System.out.println(a.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a3.hashCode());
    }
}
class AA{

}

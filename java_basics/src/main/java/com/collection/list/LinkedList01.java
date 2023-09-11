package com.collection.list;

public class LinkedList01 {
    public static void main(String[] args) {
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node han = new Node("han");

        //链接三个节点，形成链表
        jack.next = tom;
        tom.next = han;
        han.pre = tom;
        tom.pre = jack;

        Node first = jack;
        Node last = han;

        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }

        //尾到头
        System.out.println("从尾到头");
        while (true) {
            if (last == null) {
                break;
            }
            System.out.println(last);
            last = last.pre;
        }

        //插入
        last = han;
        first = jack;
        System.out.println("插入");
        Node smith = new Node("smith");
        smith.next = han;
        smith.pre = tom;
        tom.next = smith;
        han.pre = smith;
        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }
    }
}

//定义Node类，Node对象 表示双向链表的一个节点。
class Node {
    public Object item;
    public Node next;
    public Node pre;

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node name=" + item;
    }
}

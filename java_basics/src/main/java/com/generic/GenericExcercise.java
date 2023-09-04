package com.generic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class GenericExcercise {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("tom",20000,new MyDate(1980,12,11)));
        employees.add(new Employee("jack",20000,new MyDate(1980,12,11)));
        employees.add(new Employee("tom",20000,new MyDate(1980,12,11)));
        employees.add(new Employee("tom",20000,new MyDate(1980,12,11)));
        System.out.println("employees"+employees);
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                //先按照name排序，如果name相同，则按生日日期的先后排序。【即：定制排序】
                //先对传入的参数进行验证
                if (!(o1 instanceof Employee && o2 instanceof Employee)){
                    System.out.println("类型不正确");
                    return 0;
                }
                //比较name
                int i = o1.getName().compareTo(o2.getName()));
                if (i != 0){
                    return i;
                }
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });
    }
}


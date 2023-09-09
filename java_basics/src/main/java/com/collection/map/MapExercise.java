package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExercise {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put(1,new Employee(1,"john",3000));
        map.put(2,new Employee(2,"aaa",19000));
        map.put(3,new Employee(3,"hhh",6000));
        map.put(4,new Employee(4,"zhuang",30000));
        System.out.println("------第一种keySet");
        Set keySet = map.keySet();
        for (Object key : keySet) {
            Employee emp = (Employee) map.get(key);
            if (emp.getSalary()>18000){
                System.out.println(emp);
            }
        }
        System.out.println("------第二种entrySet");
        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Employee emp = (Employee) entry.getValue();
            if (emp.getSalary()>18000){
                System.out.println(emp);
            }
        }
    }
}
class Employee{
    public int id;
    private String name;
    private int salary;

    public Employee(int id,String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

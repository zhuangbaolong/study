package com.collection.set.exercise;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetExercise {
    public static void main(String[] args) {
        Set hashSet = new HashSet<>();
        hashSet.add(new Employee("aa",11));
        hashSet.add(new Employee("smith",21));
        hashSet.add(new Employee("aa",11));
        System.out.println(hashSet);
    }
}
class Employee{
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

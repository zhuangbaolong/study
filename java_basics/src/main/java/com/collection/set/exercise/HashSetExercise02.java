package com.collection.set.exercise;

import com.generic.MyDate;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetExercise02 {
    public static void main(String[] args) {
        Set hashSet = new HashSet<>();
        hashSet.add(new Employee2("tom",111,new MyDate(2000,1,1)));
        hashSet.add(new Employee2("tom",111,new MyDate(2000,1,1)));
        hashSet.add(new Employee2("java",112,new MyDate(2000,2,2)));
        hashSet.add(new Employee2("tom",112,new MyDate(2000,2,2)));
        System.out.println(hashSet);
    }
}
class Employee2{
    private String name;
    private int sal;
    private MyDate birthday;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee2)) return false;
        Employee2 employee2 = (Employee2) o;
        return sal == employee2.sal && Objects.equals(name, employee2.name) && Objects.equals(birthday, employee2.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sal, birthday);
    }

    public Employee2(String name, int sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

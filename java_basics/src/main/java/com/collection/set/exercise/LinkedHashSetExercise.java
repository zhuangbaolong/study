package com.collection.set.exercise;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class LinkedHashSetExercise {
    public static void main(String[] args) {
        Set linkedHashSet = new LinkedHashSet();
        Car aa1 = new Car("aa", 1111);
        Car aa2 = new Car("aa", 1111);
        linkedHashSet.add(aa1);
        linkedHashSet.add(new Car("bb",2222));
        System.out.println(linkedHashSet);
        System.out.println(aa1==aa2);
    }
}
class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Car)) return false;
//        Car car = (Car) o;
//        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, price);
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

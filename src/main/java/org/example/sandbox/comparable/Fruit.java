package org.example.sandbox.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Double.compare;

public class Fruit implements Comparable<Fruit> {
    private String name;
    private String color;
    private double weight;

    public Fruit(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Fruit other) {
        int nameComparison = this.name.compareTo(other.name);
        if (nameComparison != 0) {
            return nameComparison;
        }

        int colorComparison = this.color.compareTo(other.color);
        if (colorComparison != 0) {
            return colorComparison;
        }
        return compare(this.weight, other.weight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Fruit{");
        sb.append("name='").append(name).append('\'');
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple", "Red", 1.2);
        Fruit banana = new Fruit("Banana", "Yellow", 1.1);
        Fruit cherry = new Fruit("Cherry", "Red", 0.2);
        Fruit appleGreen = new Fruit("Apple", "Green", 1.3);

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(apple);
        fruits.add(banana);
        fruits.add(cherry);
        fruits.add(appleGreen);

        System.out.println("Before sorting:");
        fruits.forEach(System.out::println);

        Collections.sort(fruits);

        System.out.println("\nAfter sorting:");
        fruits.forEach(System.out::println);
    }
}
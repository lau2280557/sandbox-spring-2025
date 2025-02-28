package org.example.sandbox.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Apple extends Fruit {
    private String variety;

    public Apple(String name, String color, double weight, String variety) {
        super(name, color, weight);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Apple{");
        sb.append("name='").append(getName()).append('\'');
        sb.append(", color='").append(getColor()).append('\'');
        sb.append(", weight=").append(getWeight());
        sb.append(", variety='").append(variety).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        Apple apple1 = new Apple("Apple", "Red", 1.2, "Fuji");
        Apple apple2 = new Apple("Apple", "Green", 1.3, "Granny Smith");
        Apple apple3 = new Apple("Apple", "Yellow", 1.1, "Golden Delicious");

        List<Apple> apples = new ArrayList<>();
        apples.add(apple1);
        apples.add(apple2);
        apples.add(apple3);

        System.out.println("Before sorting:");
        apples.forEach(System.out::println);

        Collections.sort(apples);

        System.out.println("\nAfter sorting:");
        apples.forEach(System.out::println);
    }
}
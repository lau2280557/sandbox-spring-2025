package org.example.sandbox.comparable;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int compareTo(Person person) {
        if (this.firstName.compareTo(person.firstName) == 0) {
            if (this.lastName.compareTo(person.lastName) == 0) {
                return this.age - person.age;
            }
            return this.lastName.compareTo(person.lastName);
        }
        return this.firstName.compareTo(person.firstName);
    }

    @Override
    public String toString() {
        return "Person [name=" + firstName + ", age=" + age + "]";
    }

    public static void main(String[] args) {
        Person p1 = new Person("John", "Doe", 30);
        Person p2 = new Person("John", "Doe", 25);
        Person p3 = new Person("John", "Smith", 30);
        Person p4 = new Person("Jane", "Doe", 30);
        Person p5 = new Person("Jane", "Doe", 25);
        Person p6 = new Person("Jane", "Smith", 30);

        List<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p6);

        people.forEach(System.out::println);
        System.out.println();

        Collections.sort(people);
        people.forEach(System.out::println);
        System.out.println();

        Collections.reverse(people);
        people.forEach(System.out::println);
        System.out.println();

        Collections.shuffle(people);
        people.forEach(System.out::println);
        System.out.println();

        Collections.sort(people, (pA, pB) -> pA.age - pB.age);
        people.forEach(System.out::println);
        System.out.println();

        Collections.sort(people, (pA, pB) -> pB.age - pA.age);
        people.forEach(System.out::println);
        System.out.println();
        System.out.println(people);

    }
}

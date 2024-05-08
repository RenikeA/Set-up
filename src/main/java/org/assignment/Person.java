package org.assignment;

public class Person {
    public String name;
    public int Age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        Age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return Age;
    }
}

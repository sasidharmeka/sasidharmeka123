package com.deloitte.lab9.ex4;

class Person {
    private String name;
    private int age;

    public Person() {}

    public Person(String name, int age) {
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
}

public class Lab9Ex4 {
    public static void main(String[] args) {
        PersonFactory factory = Person::new;
        Person person = factory.create("John Doe", 30);
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
    }

    @FunctionalInterface
    interface PersonFactory {
        Person create(String name, int age);
    }
}

package com.sample.basics;

import java.util.HashSet;

public class HassetExample {

    String name;
    int age;

    HassetExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        HassetExample c1 = new HassetExample("John", 20);
        HassetExample c2 = new HassetExample("John", 20);

        HashSet<HassetExample> HassetExampleSet = new HashSet<>();
        HassetExampleSet.add(c1);
        HassetExampleSet.add(c2);
        System.out.println(HassetExampleSet.size());
    }

    // getters and setters
}

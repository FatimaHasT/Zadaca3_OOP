package org.FatimaHasT.qamp.zadaci.zadaca7.task1;

public class Person {
    private final String name;

    public Person(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name: " + name;
    }

}

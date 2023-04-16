package org.FatimaHasT.qamp.zadaci.zadaca7.task2;

public class Engine {
    private double capacity;

    public Engine(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void increaseCapacity(double value) {
        capacity += value;
    }

    public void decreaseCapacity(double value) {
        capacity -= value;
    }

    @Override
    public String toString() {
        return "capacity: " + capacity;
    }
}


package org.FatimaHasT.qamp.zadaci.zadaca7.task2;

public class Vehicle {
    private double speed;
    private final String model;

    public Vehicle(final String model) {
        this.model = model;
        this.speed = 0.0;
    }

    public void accelerate(final double amount) {
        this.speed += amount;
    }

    public void decelerate(final double amount) {
        if (this.speed - amount < 0.0) {
            this.speed = 0.0;
        } else {
            this.speed -= amount;
        }
    }

    @Override
    public String toString() {
        return "vehicle: " + model + ", speed: " + speed;
    }
}

package org.FatimaHasT.qamp.zadaci.zadaca7.task2;

public class Car extends Vehicle {
    private final Engine engine;

    public Car(final String model, final double capacity) {
        super(model);
        this.engine = new DieselEngine(capacity);
    }

    public void accelerate(final double speed) {
        final double factor = 0.2;
        final double fuelConsumption = factor * speed;
        if (this.engine.getCapacity() < fuelConsumption) {
            System.out.println("Not enough fuel for Diesel Car.");
        } else {
            this.engine.decreaseCapacity(fuelConsumption);
            super.accelerate(speed);
        }
    }

    public void decelerate(final double speed) {
        final double factor = 0.1;
        final double capacityIncrease = factor * speed;
        ((DieselEngine) this.engine).increaseCapacity(capacityIncrease);
        super.decelerate(speed);
    }

    @Override
    public String toString() {
        return super.toString() + ", capacity: " + engine.toString();
    }
}

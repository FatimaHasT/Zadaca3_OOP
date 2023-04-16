package org.FatimaHasT.qamp.zadaci.zadaca7.task2;

public class ElectricCar extends Vehicle {
    private final ElectricEngine engine;

    public ElectricCar(final String model, final double capacity) {
        super(model);
        this.engine = new ElectricEngine(capacity);
    }

    public void accelerate(final double speed) {
        final double factor = 0.4;
        final double fuelConsumption = factor * speed;
        if (this.engine.getCapacity() < fuelConsumption) {
            System.out.println("Not enough fuel for ElectricCar.");
        } else {
            this.engine.decreaseCapacity(fuelConsumption);
            super.accelerate(speed);
        }
    }

    public void decelerate(final double speed) {
        this.engine.brake(speed);
        super.decelerate(speed);
    }

    @Override
    public String toString() {
        return super.toString() + ", capacity: " + engine.toString();
    }
}


package org.FatimaHasT.qamp.zadaci.zadaca7.task2;

public class ElectricEngine extends Engine {
    public ElectricEngine(final double capacity) {
        super(capacity);
    }

    public void brake(final double speed) {
        final double factor = 0.1;
        final double capacityIncrease = factor * speed;
        this.increaseCapacity(capacityIncrease);
    }
}

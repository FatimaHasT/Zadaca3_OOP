package org.FatimaHasT.qamp.zadaci.zadaca7.task2;

public class VehicleMain {
    public static void main(String[] args) {
        ElectricCar ElCar = new ElectricCar("Tesla", 100);
        Car DiCar = new Car("Audi A3", 40);

        ElCar.accelerate(120);
        ElCar.decelerate(30);
        System.out.println(ElCar.toString());

        DiCar.accelerate(250);
        DiCar.decelerate(35);
        System.out.println(DiCar.toString());
    }
}

package org.FatimaHasT.qamp.zadaci.zadaca7.task1;

public class Employee extends Person {
    private double salary;
    private final String insuranceNumber;

    public Employee(final String name, final double salary, final String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.insuranceNumber = insuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(final double salary) {
        this.salary = salary;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    @Override
    public String toString() {
        return "name: " + getName() + ", salary: " + salary + ", insurance number: " + insuranceNumber;
    }


}

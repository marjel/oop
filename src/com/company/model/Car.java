package com.company.model;

public class Car extends Vehicle {
    @Override
    protected boolean accelerate(int speed) {
        System.out.println("Accelerate as a car");
        return false;
    }

    public Car() {
    }

    public Car(String name) {
        super(name);
    }
}

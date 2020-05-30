package com.company.model;

public class Bike extends Vehicle {

    @Override
    protected boolean accelerate(int speed) {
        System.out.println("Accelerate as a bike");
        return false;
    }

    public Bike() {
    }

    public Bike(String name) {
        super(name);
    }
}

package com.company.model;

public class Bike extends Vehicle {

    @Override
    protected void accelerate(int speed) {
        System.out.println("Accelerate as a bike");
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    public Bike() {
    }

    public Bike(String name) {
        super(name);
    }
}

package com.company.model;

public class Car extends Vehicle {

    private Engine engine = new FuelEngine();

    @Override
    protected void accelerate(int speed) {

        engine.setSpeed(speed);

    }

    @Override
    public void start() {
        engine.start();
    }

    @Override
    public void stop() {
        engine.stop();
    }

    public Car() {
    }

    public Car(String name) {
        super(name);
    }
}

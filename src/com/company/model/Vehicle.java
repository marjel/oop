package com.company.model;

public abstract class Vehicle {

    private String name;

    private int speed;

    protected abstract boolean accelerate(int speed);

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        this.accelerate(speed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void start() {
        System.out.println("vehicle started");
    }

    public void stop() {
        System.out.println("Vehicle stopped");
    }
    public Vehicle() {
        System.out.println("Vehicle");
    }

    public Vehicle(String name) {
        this.name = name;
    }
}

package com.company.model;

public abstract class Vehicle {

    private String name;

    private Integer speed;

    public boolean isStarted() {
        return started;
    }

    protected boolean started;
    protected abstract void accelerate(int speed);

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
        this.accelerate(speed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void start();

    public abstract void stop();

    public Vehicle() {
        System.out.println("Vehicle");
    }

    public Vehicle(String name) {
        this.name = name;
    }
}

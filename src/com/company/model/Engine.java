package com.company.model;

public abstract class Engine {

    private Integer speed;

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        accelerate(speed);
        this.speed = speed;
    }

    protected abstract void working(Integer power);

    protected void injectPower(Integer power) {
        this.working(power);
    }

    protected void start() {
        injectPower(1);
    }
    protected void stop() {
        injectPower(0);
    }
    protected void accelerate(Integer value) {
        injectPower(value);
    }

}

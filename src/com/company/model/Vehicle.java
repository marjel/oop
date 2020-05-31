package com.company.model;

import com.company.exception.NotStartedEngineException;

public abstract class Vehicle {

    private String name;

    private Integer speed;

    public boolean isStarted() {
        return started;
    }

    protected boolean started;
    protected abstract void accelerate(int speed) throws NotStartedEngineException;

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
        //try{
            this.accelerate(speed);
       /* }catch (NotStartedEngineException e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }finally {
            System.out.println("Finally");
        }*/

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

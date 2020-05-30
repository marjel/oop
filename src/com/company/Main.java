package com.company;

import com.company.model.Car;
import com.company.model.Vehicle;

public class Main {

    public static void main(String[] args) {
        // System.out.println("Start");
        Vehicle vehicle = new Car();

        String name = vehicle.getName();

        Integer speed = vehicle.getSpeed();

        vehicle.setSpeed(10);

    }
}

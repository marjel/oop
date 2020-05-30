package com.company;

import com.company.model.Bike;
import com.company.model.Car;
import com.company.model.Vehicle;

public class Main {

    public static void main(String[] args) {
        // System.out.println("Start");
        Vehicle vehicle = new Car();
        //vehicle = new Bike();

        //vehicle.setName("nazwa");
        String name = vehicle.getName();

        Integer speed = vehicle.getSpeed();

        vehicle.setSpeed(10);

        System.out.println(speed);

        System.out.println(name);

    }
}

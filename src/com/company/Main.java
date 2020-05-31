package com.company;

import com.company.abstractFactory.AbstractRace;
import com.company.model.Car;
import com.company.model.Vehicle;
import com.company.strategy.CarTypeStrategy;

public class Main {

    public static void main(String[] args) {
        // System.out.println("Start");
        Vehicle vehicle = new Car();

        String name = vehicle.getName();

        Integer speed = vehicle.getSpeed();

        vehicle.setSpeed(10);

        AbstractRace race = AbstractRace.getRace(vehicle);

        System.out.println(race.getLapsNumber());

        CarTypeStrategy cabriolet = new CarTypeStrategy() {

            @Override
            public String getType() {
                return "cabriolet";
            }
        };

        final Car car = (Car) vehicle;
        car.setTypeStrategy(cabriolet);

        System.out.println(car.getType());


    }
}

package com.company;

import com.company.abstractFactory.AbstractRace;
import com.company.enumeration.ProductType;
import com.company.factoryMethod.Implementation1;
import com.company.factoryMethod.Implementation2;
import com.company.factoryMethod.Service;
import com.company.factoryMethod.ServiceFactory;
import com.company.model.Car;
import com.company.model.Vehicle;
import com.company.strategy.CarTypeStrategy;

public class Main {

    public static void serviceConsumer(ServiceFactory factory) {

        Service service = factory.getService();
        service.method1();
        service.method2();


    }

    private static void iterateEnum() {
        for (ProductType productType: ProductType.values()) {
            System.out.println(productType + " description = " + productType.getNumericValue());
        }
    }

    public static void main(String[] args) {
        // System.out.println("Start");
        Vehicle vehicle = new Car();

        String name = vehicle.getName();

        Integer speed = vehicle.getSpeed();

        vehicle.start();
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

        /*
        * factory method
        *
        serviceConsumer(Implementation1.factory);
        serviceConsumer(Implementation2.factory);*/

        iterateEnum();

    }
}

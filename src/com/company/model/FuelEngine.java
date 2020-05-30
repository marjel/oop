package com.company.model;

public class FuelEngine extends Engine {


    @Override
    protected void working(Integer power) {
        if(power == 0) {
            System.out.println("FuelEngine is not working");
        } else {
            System.out.println("FuelEngine is working: " + power);
        }

    }
}

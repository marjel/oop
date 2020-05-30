package com.company.factory;

import com.company.model.Car;
import com.company.model.Vehicle;

public abstract class AbstractRace {

    public static AbstractRace getRace(Vehicle attendee) {

        if(attendee instanceof Car) {
            return new CarRace();
        }
        return null;

    }
    public abstract Integer getLapsNumber();

}

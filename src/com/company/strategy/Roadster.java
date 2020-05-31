package com.company.strategy;

public class Roadster implements CarTypeStrategy{
    @Override
    public String getType() {
        return "roadster";
    }
}

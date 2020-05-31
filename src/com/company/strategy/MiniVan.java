package com.company.strategy;

public class MiniVan implements CarTypeStrategy{
    @Override
    public String getType() {
        return "mini van";
    }
}

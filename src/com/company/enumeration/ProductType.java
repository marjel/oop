package com.company.enumeration;

public enum ProductType {

    VEHICLE(0),
    GROCERY_PRODUCT(1),
    SERVICE(2),
    TRIP(3);

    private Integer numericValue;

    public Integer getNumericValue() {
        return numericValue;
    }

    private ProductType(Integer numericValue) {
        this.numericValue = numericValue;
    }
}

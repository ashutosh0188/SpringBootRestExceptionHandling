package com.example.springbootexceptionhandlingrest.domain;

public enum OrderType {
    CLOTHE, ELECTRONIC, HYBRID;

    public static OrderType value(String value) {
        for (OrderType ot : OrderType.values()) {
            if(ot.name().equalsIgnoreCase(value)) {
                return ot;
            }
        }
        return null;
    }
}

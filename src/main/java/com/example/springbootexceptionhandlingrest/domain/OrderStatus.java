package com.example.springbootexceptionhandlingrest.domain;

public enum OrderStatus {
    CREATED, IN_PROGRESS, COMPLETED, CANCELLED;

    public static OrderStatus value(String value) {
        for (OrderStatus os : OrderStatus.values()) {
            if(os.name().equalsIgnoreCase(value)) {
                return os;
            }
        }
        return null;
    }
}

package com.example.springbootexceptionhandlingrest.util;

import com.example.springbootexceptionhandlingrest.domain.Order;
import com.example.springbootexceptionhandlingrest.domain.OrderStatus;
import com.example.springbootexceptionhandlingrest.domain.OrderType;

public class OrderBuilder {
    private Order order;

    public OrderBuilder() {
        this.order = new Order();
    }

    public OrderBuilder withClientName(String clientName) {
        this.order.setClientName(clientName);
        return this;
    }

    public OrderBuilder withOrderType(String orderType) {
        this.order.setOrderType(OrderType.value(orderType));
        return this;
    }

    public OrderBuilder withOrderStatus(String orderStatus) {
        this.order.setOrderStatus(OrderStatus.value(orderStatus));
        return this;
    }

    public Order createOrder() {
        this.order.setOrderId(System.currentTimeMillis());
        return this.order;
    }
}

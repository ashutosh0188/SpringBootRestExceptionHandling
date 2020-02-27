package com.example.springbootexceptionhandlingrest.respository;

import com.example.springbootexceptionhandlingrest.domain.Order;
import com.example.springbootexceptionhandlingrest.domain.OrderStatus;
import com.example.springbootexceptionhandlingrest.domain.OrderType;
import com.example.springbootexceptionhandlingrest.util.OrderBuilder;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AppRepository {
    private static List<Order> orders = null;

    static {
        orders = new ArrayList<>();
        Order o = new OrderBuilder().withClientName("DemoClient1").withOrderType(OrderType.CLOTHE.name()).withOrderStatus(OrderStatus.CREATED.name()).createOrder();
        o.setOrderId(1L); //overriding default orderId to 1 for test purpose
        orders.add(o);
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order findOrderByOrderId(long orderId) {
        for (Order order : orders) {
            if (order.getOrderId().equals(orderId)) {
                return order;
            }
        }
        return null;
    }

    public List<Order> findOrderByOrderType(String orderType) {
        List<Order> o = new ArrayList<>();
        orders.forEach(order -> {
            if (order.getOrderType().equals(OrderType.value(orderType))) {
                o.add(order);
            }
        });
        return o;
    }

    public List<Order> findOrderByOrderStatus(String orderStatus) {
        List<Order> o = new ArrayList<>();
        orders.forEach(order -> {
            if (order.getOrderStatus().equals(OrderStatus.value(orderStatus))) {
                o.add(order);
            }
        });
        return o;
    }

    public List<Order> findAllOrders() {
        return orders;
    }
}

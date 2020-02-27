package com.example.springbootexceptionhandlingrest.service;

import com.example.springbootexceptionhandlingrest.domain.Order;
import com.example.springbootexceptionhandlingrest.respository.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppService {
    @Autowired
    private AppRepository appRepository;

    public void addOrder(Order order) {
        if(order.getOrderId()==null) {
            order.setOrderId(System.currentTimeMillis());
        }
        else if(getOrderByOrderId(order.getOrderId())!=null) {
            order.setOrderId(System.currentTimeMillis());
        }
        appRepository.addOrder(order);
    }

    public Order getOrderByOrderId(long orderId) {
        return appRepository.findOrderByOrderId(orderId);
    }

    public List<Order> getOrderByOrderType(String orderType) {
        return appRepository.findOrderByOrderType(orderType);
    }

    public List<Order> getOrderByOrderStatus(String orderStatus) {
        return appRepository.findOrderByOrderStatus(orderStatus);
    }

    public List<Order> getAllOrders() {
        return appRepository.findAllOrders();
    }
}

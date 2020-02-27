package com.example.springbootexceptionhandlingrest.controller;

import com.example.springbootexceptionhandlingrest.domain.Order;
import com.example.springbootexceptionhandlingrest.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppController {

    @Autowired
    private AppService appService;

    @GetMapping("/")
    public String hello() {
        return "It's working";
    }

    @PostMapping("/order/create")
    public void addOrder(@RequestBody Order order) {
        appService.addOrder(order);
    }

    @GetMapping("/order/{orderId}")
    public Order getOrderByOrderId(@PathVariable("orderId") long orderId) {
        return appService.getOrderByOrderId(orderId);
    }

    @GetMapping("/order/type/{orderType}")
    public List<Order> getOrderByOrderType(@PathVariable String orderType) {
        return appService.getOrderByOrderType(orderType);
    }

    @GetMapping("/order/status/{orderStatus}")
    public List<Order> getOrderByOrderStatus(@PathVariable String orderStatus) {
        return appService.getOrderByOrderStatus(orderStatus);
    }

    @GetMapping("/order/all")
    public List<Order> getAllOrders() {
        return appService.getAllOrders();
    }
}

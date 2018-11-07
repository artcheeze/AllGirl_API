/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.girls.TheGirl.Orders;

import com.girls.TheGirl.OrderHasProduct.*;
import com.girls.TheGirl.Product.Product;
import com.girls.TheGirl.Product.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author A
 */
@Service
public class OrdersService {
     private OrdersRepository OrdersRepository;

    @Autowired
    public OrdersService(OrdersRepository repository) {
        this.OrdersRepository = repository;
    }

    public List<Orders> retrieveOrders() {
        return (List<Orders>) OrdersRepository.findAll();
    }



    public Orders createOrders(Orders o) {
        return OrdersRepository.save(o);
    }
}

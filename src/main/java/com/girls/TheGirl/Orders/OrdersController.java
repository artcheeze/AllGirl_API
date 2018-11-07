package com.girls.TheGirl.Orders;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.girls.TheGirl.Product.Product;
import com.girls.TheGirl.OrderHasProduct.OHProductService;
import com.girls.TheGirl.Orders.Orders;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author A
 */
@RestController
@RequestMapping("/Orders")
public class OrdersController {

    @Autowired
    OrdersService OrdersService;

    @GetMapping()
    public List<Orders> getOrders() {
        return OrdersService.retrieveOrders();
    }

}

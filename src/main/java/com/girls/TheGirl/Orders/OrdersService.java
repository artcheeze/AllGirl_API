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
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author A
 */
@Service //แหล่งmethodที่ต้องใช้
public class OrdersService {
     private OrdersRepository OrdersRepository;

    @Autowired
    public OrdersService(OrdersRepository repository) { //เรียกเชื่อม
        this.OrdersRepository = repository;
    }

    public List<Orders> retrieveOrders() { //เรียกorderทั้งหมด
        return (List<Orders>) OrdersRepository.findAll();
    }


    public Orders createOrders(Orders o) { //เพิ่มorder
        return OrdersRepository.save(o);
    }
    
    //แก้ไขaddressในแต่ละorder
    public Optional<Orders> updateAddress(Long id, Orders Order) {
        Optional<Orders> OrdersOptional = OrdersRepository.findById(id);
        return Optional.of(OrdersRepository.save(Order));
    }
}

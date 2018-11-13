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
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author A
 */
@RestController
@RequestMapping("/Orders")
public class OrdersController {

    @Autowired //เป็นการเชื่อมclassกัน อย่างauto
    OrdersService OrdersService;

    @GetMapping()
    public List<Orders> getOrders() {
        return OrdersService.retrieveOrders();
    }
    //สร้างรับ post จากอาทฟร้อน
    @PostMapping()
    public ResponseEntity<?> postOrder(@Valid @RequestBody Orders body){
        Orders o = OrdersService.createOrders(body);
        System.out.println(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(o);
    }
}

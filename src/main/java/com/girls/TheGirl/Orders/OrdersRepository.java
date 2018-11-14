/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.girls.TheGirl.Orders;

//import com.girls.TheGirl.OrderHasProduct.*;
import com.girls.TheGirl.Product.Product;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author A
 */
public interface OrdersRepository extends CrudRepository<Orders, Long> {
    //List<Product> findByFirstName(String firstName);

}
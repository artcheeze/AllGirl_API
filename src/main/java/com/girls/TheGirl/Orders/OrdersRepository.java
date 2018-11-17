/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.girls.TheGirl.Orders;


import com.girls.TheGirl.Product.Product;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author A
 */
public interface OrdersRepository extends JpaRepository<Orders, Long> {

    //Optional<Orders> findById(int orderId);
    //List<Product> findByFirstName(String firstName);

}
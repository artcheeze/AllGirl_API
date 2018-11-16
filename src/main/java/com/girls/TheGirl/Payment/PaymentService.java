/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.girls.TheGirl.Payment;

import com.girls.TheGirl.Orders.*;

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
public class PaymentService {
     private PaymentRepository PaymentRepository;

    @Autowired
    public PaymentService(PaymentRepository repository) {
        this.PaymentRepository = repository;
    }

    public List<Payment> retrievePayment() {
        return (List<Payment>) PaymentRepository.findAll();
    }



    public Payment createPayment(Payment p) {
        return PaymentRepository.save(p);
    }
}

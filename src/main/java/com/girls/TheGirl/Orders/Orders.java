/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.girls.TheGirl.Orders;

import com.girls.TheGirl.Payment.Payment;
import com.girls.TheGirl.Product.Product;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 *
 * @author A
 */
@Data
@Entity
public class Orders {
   @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    @NotNull
    @OneToOne
    @JoinColumn(name = "prodId")
    private Product prodId;

    @NotNull
    private int totalPrice;
    
    @NotNull
    private int quantity;
    
    
    @NotNull
    private String promoCode;

    @NotNull
    @OneToOne
    @JoinColumn(name = "paymentId")
    private Payment paymentId;
    
     @NotNull
    private String address; 
     
     //แก้ตามerแล้ว

    
}

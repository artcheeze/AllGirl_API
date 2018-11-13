/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.girls.TheGirl.Payment;

import com.girls.TheGirl.Orders.Orders;
import com.girls.TheGirl.Product.Product;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 *
 * @author A
 */
@Data
@Entity
public class Payment {

    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long paymentId;

    @Temporal(TemporalType.DATE)
    private Date dateTime;

    @NotNull
    private String creditCard;
    
    @NotNull
    private String status;
    
    @NotNull
    @OneToOne
    @JoinColumn(name = "orderId")
    private Orders orderId;

    @NotNull
    private double totalPrice;

   
}

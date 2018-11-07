/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.girls.TheGirl.OrderHasProduct;

import com.girls.TheGirl.Product.Product;
import java.io.Serializable;
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
public class OHProduct {
    @NotNull
    @OneToOne
    @JoinColumn(name = "prodId")
    private Product prodId;
    
    @NotNull
    private int quntity;
    
     @NotNull
    @OneToOne
    @JoinColumn(name = "prodPrice")
    private Product prodPrice;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long OHPid;

    
}

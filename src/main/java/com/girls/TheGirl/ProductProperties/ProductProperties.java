/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.girls.TheGirl.ProductProperties;
import com.girls.TheGirl.Product.Product;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.*;

import lombok.Data;

/**
 *
 * @author A
 */
@Data
@Entity
public class ProductProperties implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long prodPropId;

//    @NotNull
//    @OneToOne
//    @JoinColumn (name ="prodId")
    private int prodId;
   
    private String prodSize;
    private String prodColor;

    public ProductProperties(String prodSize, String prodColor) {
        this.prodSize = prodSize;
        this.prodColor = prodColor;
    }
    
    public ProductProperties(){
        super();
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.girls.TheGirl.Product;
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
public class ProductProperties {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long prodPropId;

    @NotNull
    @OneToOne
    @JoinColumn (name ="prodId")
    private Product prodId;
   
    private String prodSize;
    private String prodColor;
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.girls.TheGirl.Promocode;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

/**
 *
 * @author A
 */
@Data
@Entity
public class PromoCode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long promoId;

    @Temporal(TemporalType.DATE)
    private Date expireDate;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.girls.TheGirl.Promocode;

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
class PromoCodeService {
    private PromoCodeRepository PromoCodeRepository;

    @Autowired
    public PromoCodeService(PromoCodeRepository repository) {
        this.PromoCodeRepository = repository;
    }

    public List<PromoCode> retrievePromoCode() {
        return (List<PromoCode>) PromoCodeRepository.findAll();
    }



    public PromoCode createPromoCode(PromoCode pc) {
        return PromoCodeRepository.save(pc);
    }
}

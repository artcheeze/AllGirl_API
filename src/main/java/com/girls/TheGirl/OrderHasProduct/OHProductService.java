/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.girls.TheGirl.OrderHasProduct;

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
public class OHProductService {
     private OHProductRepository OHProductRepository;

    @Autowired
    public OHProductService(OHProductRepository repository) {
        this.OHProductRepository = repository;
    }

    public List<OHProduct> retrieveOHProduct() {
        return (List<OHProduct>) OHProductRepository.findAll();
    }



    public OHProduct createOHProduct(OHProduct ohp) {
        return OHProductRepository.save(ohp);
    }
}

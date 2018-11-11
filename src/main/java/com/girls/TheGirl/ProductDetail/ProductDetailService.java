/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.girls.TheGirl.ProductDetail;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrator
 */
@Service
public class ProductDetailService {
    private ProductDetailRepository productDetailRepository;

    @Autowired
    public ProductDetailService(ProductDetailRepository repository) {
        this.productDetailRepository = repository;
    }

    public List<ProductDetail> retrieveProductDetail() {
        return (List<ProductDetail>) productDetailRepository.findAll();
    }

    public Optional<ProductDetail> retrieveProductDetail(Long id) {
        return productDetailRepository.findById(id);
    }

}

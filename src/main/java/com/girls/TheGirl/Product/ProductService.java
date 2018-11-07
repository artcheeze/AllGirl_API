/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.girls.TheGirl.Product;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

/**
 *
 * @author A
 */
@Service
class ProductService {
   private ProductRepository ProductRepository;

    @Autowired
    public ProductService(ProductRepository repository) {
        this.ProductRepository = repository;
    }

    public List<Product> retrieveProduct() {
        return (List<Product>) ProductRepository.findAll();
    }



    public Product createProduct(Product product) {
        return ProductRepository.save(product);
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.girls.TheGirl.ProductProperties;

import com.girls.TheGirl.Product.Product;
import com.girls.TheGirl.Product.ProductRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrator
 */
@Service
public class ProductPropertiesService {

    private ProductPropertiesRepository productPropertiesRepository;
    
    @Autowired
    public ProductPropertiesService(ProductPropertiesRepository repository) {
        this.productPropertiesRepository = repository;
    }
    
    public List<ProductProperties> retrieveProductProperties() {
        return (List<ProductProperties>) productPropertiesRepository.findAll();
    }
    
    public Optional<ProductProperties> retrieveProductProperties(Long id) {
        return productPropertiesRepository.findById(id);
    }
    
    public ProductProperties createProductProperties (ProductProperties prodProp){
        return productPropertiesRepository.save(prodProp);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.girls.TheGirl.ProductProperties;

import com.girls.TheGirl.ProductDetail.ProductDetail;
import com.girls.TheGirl.ProductDetail.ProductDetailService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Administrator
 */

@RestController
@RequestMapping("/ProductController")
public class ProductPropertiesController {
    
    @Autowired
    ProductPropertiesService productPropertiesService;
    
    @GetMapping()
    public List<ProductProperties> getProductProperties() {
        return productPropertiesService.retrieveProductProperties();
    }

    @GetMapping("/{id}")
     public ResponseEntity<?> getProductDetailById(@PathVariable Long id) {
        Optional<ProductProperties> prodProperties = productPropertiesService.retrieveProductProperties(id);
        if(prodProperties.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(prodProperties);
    }
}

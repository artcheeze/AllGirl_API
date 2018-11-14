/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.girls.TheGirl.ProductProperties;

import com.girls.TheGirl.Product.Product;
import com.girls.TheGirl.ProductDetail.ProductDetail;
import com.girls.TheGirl.ProductDetail.ProductDetailService;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Administrator
 */

@RestController
@RequestMapping("/ProductProperties")
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
     
    @PostMapping()
    public ResponseEntity<?> postProductPropertiesController(@Valid @RequestBody ProductProperties body){
        ProductProperties prodProp = productPropertiesService.createProductProperties(body);
        
        return ResponseEntity.status(HttpStatus.CREATED).body(prodProp);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.girls.TheGirl.ProductDetail;

import com.girls.TheGirl.Product.Product;
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
@RequestMapping("/ProductDetail")
public class ProductDetailController {

    @Autowired
    ProductDetailService productDetailService;

    @GetMapping("/")
    public List<ProductDetail> getProductDetail() {
        return productDetailService.retrieveProductDetail();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProductDetailById(@PathVariable Long id) {
        Optional<ProductDetail> prodDetail = productDetailService.retrieveProductDetail(id);
        if(prodDetail.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(prodDetail);
    }
}

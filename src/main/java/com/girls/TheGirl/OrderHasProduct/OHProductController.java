/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.girls.TheGirl.OrderHasProduct;

import com.girls.TheGirl.Product.Product;
import com.girls.TheGirl.OrderHasProduct.OHProductService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author A
 */
@RestController
@RequestMapping("/OHProduct")
public class OHProductController {

    @Autowired
    OHProductService OHProductService;

    @GetMapping()
    public List<OHProduct> getProduct() {
        return OHProductService.retrieveOHProduct();
    }
    
    public ResponseEntity<?> postCustomer(@Valid @RequestBody OHProduct body){
        OHProduct ohp = OHProductService.createOHProduct(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(ohp);
    }

}

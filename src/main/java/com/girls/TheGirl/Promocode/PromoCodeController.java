/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.girls.TheGirl.Promocode;

import com.girls.TheGirl.Product.*;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author A
 */
@RestController
@RequestMapping("/PromoCode")
public class PromoCodeController {
    
    @Autowired
    PromoCodeService PromoCodeService;
    
    //////////////////////////////////////เรียกดูสินค้าทั้งหมด ดูได้ใน Service/////////////////////////////////////
    @GetMapping()
    public List<PromoCode> getPromoCode() {
        return PromoCodeService.retrievePromoCode();
    }
    
    //////////////////////////////////////เพิ่มสินค้าด้วย JSON ในรูปแบบของการยิง POST เข้ามา/////////////////////////////////////
    @PostMapping("/add")
    public ResponseEntity<?> postPromoCode(@Valid @RequestBody PromoCode body){
        PromoCode pc = PromoCodeService.createPromoCode(body);
        
        return ResponseEntity.status(HttpStatus.CREATED).body(pc);
    }
    
    @PostMapping("/check")
    public int postCheckPromoCode(@Valid @RequestBody PromoCode body){  
        System.out.println(body);
       return body.getDiscount();
    }
    
}

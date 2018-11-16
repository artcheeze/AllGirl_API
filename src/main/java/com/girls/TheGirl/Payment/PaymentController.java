package com.girls.TheGirl.Payment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import co.omise.Client;
import co.omise.ClientException;
import co.omise.models.Charge;
import co.omise.models.OmiseException;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.girls.TheGirl.Orders.*;
import com.girls.TheGirl.Product.Product;

import com.girls.TheGirl.Orders.Orders;
import java.io.IOException;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author A
 */
@RestController
@RequestMapping("/Payment")
public class PaymentController {
    @JsonDeserialize
    @PostMapping()
    public String postPayment(@RequestParam(name="omiseToken") String body,@RequestParam(name="total") int total) throws ClientException, IOException, OmiseException{
        Client client = new Client("pkey_test_5dwrs15v3vx4cildg78", "skey_test_5dwrs15ve85hs0x93i1");
        try {
            Charge charge = client.charges().create(new Charge.Create()
                    .amount(total) // THB 1,000.00
                    .currency("THB")
                    .card(body));
        } catch (IOException e) {
            System.out.println(e);
        }
       

        return "aaa";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.girls.TheGirl.Product;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author A
 */
public interface ProductRepository extends CrudRepository<Product, Long> {
    //List<Product> findByFirstName(String firstName);

}

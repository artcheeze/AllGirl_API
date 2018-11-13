/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.girls.TheGirl.ProductProperties;

import com.girls.TheGirl.Product.Product;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Administrator
 */
public interface ProductPropertiesRepository extends JpaRepository<ProductProperties, Long> {

    List<ProductProperties> findById(long prodId);
    
}

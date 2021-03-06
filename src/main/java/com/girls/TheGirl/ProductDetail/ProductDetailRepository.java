package com.girls.TheGirl.ProductDetail;

import com.girls.TheGirl.Product.Product;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

public interface ProductDetailRepository extends JpaRepository<ProductDetail, Long> {

    List<Product> findById(long prodId);

}

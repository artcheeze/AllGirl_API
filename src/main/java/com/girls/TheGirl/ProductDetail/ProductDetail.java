package com.girls.TheGirl.ProductDetail;

import com.girls.TheGirl.Product.Product;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.*;

import lombok.Data;

@Data
@Entity
public class ProductDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long prodDetailId;
    
<<<<<<< HEAD
    @NotNull
=======
//    @NotNull
//    @OneToOne
//    @JoinColumn(name ="prodId")
>>>>>>> 1f8cb86047815e6a8a3d966893e0206d338cba51
    private int prodId;

    @NotNull
    private String prodCategory;
    private String prodDetail;
    private String prodImage;
    
    @NotNull
    private String prodBrand;
}

package com.girls.TheGirl.ProductDetail;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

import lombok.Data;

@Data
@Entity
public class ProductDetail implements Serializable {

    @NotBlank
    @Id
    private long prodId;

    @NotNull
    private String prodCategory;
    private String prodDetail;

    private String prodProperties;
}

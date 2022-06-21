package com.casa.webtest1.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ProductList implements Serializable {

    private Long id;
    private String cod;
    private String name;
    private BigDecimal price;
    private Integer stock;

}

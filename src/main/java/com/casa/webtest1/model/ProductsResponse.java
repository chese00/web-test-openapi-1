package com.casa.webtest1.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductsResponse implements Serializable {

    private List<ProductList> prods;

}

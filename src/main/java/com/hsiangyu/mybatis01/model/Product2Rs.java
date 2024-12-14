package com.hsiangyu.mybatis01.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/* Product2 Response model */
public class Product2Rs {

    @JsonProperty("product2List")
    private List<Product2Dto> product2List;

    public List<Product2Dto> getProduct2List() {
        return product2List;
    }

    public void setProduct2List(List<Product2Dto> product2List) {
        this.product2List = product2List;
    }

}

package com.hsiangyu.mybatis01.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* Product2Delete Response model */
public class Product2DeleteRs {

    @JsonProperty("deleteCount")
    private int deleteCount;

    public int getDeleteCount() {
        return deleteCount;
    }

    public void setDeleteCount(int deleteCount) {
        this.deleteCount = deleteCount;
    }

}

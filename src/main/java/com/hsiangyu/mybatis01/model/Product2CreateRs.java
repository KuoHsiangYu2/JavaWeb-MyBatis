package com.hsiangyu.mybatis01.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* Product2Create Response model */
public class Product2CreateRs {

    @JsonProperty("createStatus")
    private boolean createStatus;

    public boolean isCreateStatus() {
        return createStatus;
    }

    public void setCreateStatus(boolean createStatus) {
        this.createStatus = createStatus;
    }

}

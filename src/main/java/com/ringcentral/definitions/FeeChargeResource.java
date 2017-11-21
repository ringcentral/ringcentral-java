package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class FeeChargeResource
{
    //
    public String description;
    public FeeChargeResource description(String description) {
        this.description = description;
        return this;
    }
    //
    public Double amount;
    public FeeChargeResource amount(Double amount) {
        this.amount = amount;
        return this;
    }
    //
    public String feature;
    public FeeChargeResource feature(String feature) {
        this.feature = feature;
        return this;
    }
}

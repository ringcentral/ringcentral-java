package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ShippingMethod
{
    // Internal identifier of the shipping method
    public String id;
    public ShippingMethod id(String id) {
        this.id = id;
        return this;
    }
    // Name/description of the shipping method
    public String name;
    public ShippingMethod name(String name) {
        this.name = name;
        return this;
    }
}

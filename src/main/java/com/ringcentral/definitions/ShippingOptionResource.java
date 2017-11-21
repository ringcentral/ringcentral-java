package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ShippingOptionResource
{
    //
    public String uri;
    public ShippingOptionResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public ShippingMethod method;
    public ShippingOptionResource method(ShippingMethod method) {
        this.method = method;
        return this;
    }
    //
    public Long quantity;
    public ShippingOptionResource quantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    //
    public Double price;
    public ShippingOptionResource price(Double price) {
        this.price = price;
        return this;
    }
}

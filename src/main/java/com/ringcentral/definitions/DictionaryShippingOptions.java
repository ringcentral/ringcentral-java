package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class DictionaryShippingOptions
{
    // Quantity of devices to ship
    public Long quantity;
    public DictionaryShippingOptions quantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    // Price for shipping with the specified method (depending on the quantity value)
    public Long price;
    public DictionaryShippingOptions price(Long price) {
        this.price = price;
        return this;
    }
    // Shipping method description
    public ShippingMethod method;
    public DictionaryShippingOptions method(ShippingMethod method) {
        this.method = method;
        return this;
    }
}

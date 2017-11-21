package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ShippingOptionsResource
{
    //
    public String uri;
    public ShippingOptionsResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public ShippingOptionResource[] records;
    public ShippingOptionsResource records(ShippingOptionResource[] records) {
        this.records = records;
        return this;
    }
    //
    public Paging paging;
    public ShippingOptionsResource paging(Paging paging) {
        this.paging = paging;
        return this;
    }
    //
    public Navigation navigation;
    public ShippingOptionsResource navigation(Navigation navigation) {
        this.navigation = navigation;
        return this;
    }
}

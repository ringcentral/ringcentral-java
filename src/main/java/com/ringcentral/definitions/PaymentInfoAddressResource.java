package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PaymentInfoAddressResource
{
    //
    public String country;
    public PaymentInfoAddressResource country(String country) {
        this.country = country;
        return this;
    }
    //
    public String state;
    public PaymentInfoAddressResource state(String state) {
        this.state = state;
        return this;
    }
    //
    public String city;
    public PaymentInfoAddressResource city(String city) {
        this.city = city;
        return this;
    }
    //
    public String street;
    public PaymentInfoAddressResource street(String street) {
        this.street = street;
        return this;
    }
    //
    public String zip;
    public PaymentInfoAddressResource zip(String zip) {
        this.zip = zip;
        return this;
    }
}

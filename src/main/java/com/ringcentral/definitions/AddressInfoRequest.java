package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AddressInfoRequest
{
    // User street address
    public String streetAddress;
    public AddressInfoRequest streetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
        return this;
    }
    // User city
    public String locality;
    public AddressInfoRequest locality(String locality) {
        this.locality = locality;
        return this;
    }
    // User state/region
    public String region;
    public AddressInfoRequest region(String region) {
        this.region = region;
        return this;
    }
    // User postal code
    public String postalCode;
    public AddressInfoRequest postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }
    // User country
    public String country;
    public AddressInfoRequest country(String country) {
        this.country = country;
        return this;
    }
    // Address type
    public String type;
    public AddressInfoRequest type(String type) {
        this.type = type;
        return this;
    }
}

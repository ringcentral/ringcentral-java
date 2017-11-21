package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AddressInfo
{
    // Specifies if this is the main user address
    public Boolean primary;
    public AddressInfo primary(Boolean primary) {
        this.primary = primary;
        return this;
    }
    // User street address
    public String streetAddress;
    public AddressInfo streetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
        return this;
    }
    // User city
    public String locality;
    public AddressInfo locality(String locality) {
        this.locality = locality;
        return this;
    }
    // User state/region
    public String region;
    public AddressInfo region(String region) {
        this.region = region;
        return this;
    }
    // User postal code
    public String postalCode;
    public AddressInfo postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }
    // User country
    public String country;
    public AddressInfo country(String country) {
        this.country = country;
        return this;
    }
    // Address type
    public String type;
    public AddressInfo type(String type) {
        this.type = type;
        return this;
    }
}

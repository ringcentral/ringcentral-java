package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ShippingAddressInfo
{
    // Name of a receiver
    public String customerName;
    public ShippingAddressInfo customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    // Street address, line 1 - street address, P.O. box, company name, c/o
    public String street;
    public ShippingAddressInfo street(String street) {
        this.street = street;
        return this;
    }
    // Street address, line 2 - apartment, suite, unit, building, floor, etc.
    public String street2;
    public ShippingAddressInfo street2(String street2) {
        this.street2 = street2;
        return this;
    }
    // City name
    public String city;
    public ShippingAddressInfo city(String city) {
        this.city = city;
        return this;
    }
    // State/province name
    public String state;
    public ShippingAddressInfo state(String state) {
        this.state = state;
        return this;
    }
    // Zip code
    public String zip;
    public ShippingAddressInfo zip(String zip) {
        this.zip = zip;
        return this;
    }
    // Country name
    public String country;
    public ShippingAddressInfo country(String country) {
        this.country = country;
        return this;
    }
}

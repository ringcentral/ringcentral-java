package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class EmergencyAddressInfoRequest
{
    // Name of a customer
    public String customerName;
    public EmergencyAddressInfoRequest customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    // Street address, line 1 - street address, P.O. box, company name, c/o
    public String street;
    public EmergencyAddressInfoRequest street(String street) {
        this.street = street;
        return this;
    }
    // Street address, line 2 - apartment, suite, unit, building, floor, etc
    public String street2;
    public EmergencyAddressInfoRequest street2(String street2) {
        this.street2 = street2;
        return this;
    }
    // City name
    public String city;
    public EmergencyAddressInfoRequest city(String city) {
        this.city = city;
        return this;
    }
    // State/province name
    public String state;
    public EmergencyAddressInfoRequest state(String state) {
        this.state = state;
        return this;
    }
    // Zip code
    public String zip;
    public EmergencyAddressInfoRequest zip(String zip) {
        this.zip = zip;
        return this;
    }
    // Country name
    public String country;
    public EmergencyAddressInfoRequest country(String country) {
        this.country = country;
        return this;
    }
}

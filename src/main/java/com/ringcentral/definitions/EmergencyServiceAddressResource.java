package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class EmergencyServiceAddressResource
{
    //
    public String street;
    public EmergencyServiceAddressResource street(String street) {
        this.street = street;
        return this;
    }
    //
    public String street2;
    public EmergencyServiceAddressResource street2(String street2) {
        this.street2 = street2;
        return this;
    }
    //
    public String city;
    public EmergencyServiceAddressResource city(String city) {
        this.city = city;
        return this;
    }
    //
    public String state;
    public EmergencyServiceAddressResource state(String state) {
        this.state = state;
        return this;
    }
    //
    public String country;
    public EmergencyServiceAddressResource country(String country) {
        this.country = country;
        return this;
    }
    //
    public String zip;
    public EmergencyServiceAddressResource zip(String zip) {
        this.zip = zip;
        return this;
    }
    //
    public String customerName;
    public EmergencyServiceAddressResource customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
}

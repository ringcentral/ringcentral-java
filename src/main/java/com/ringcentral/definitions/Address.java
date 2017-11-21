package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class Address
{
    //
    public String country;
    public Address country(String country) {
        this.country = country;
        return this;
    }
    //
    public String state;
    public Address state(String state) {
        this.state = state;
        return this;
    }
    //
    public String city;
    public Address city(String city) {
        this.city = city;
        return this;
    }
    //
    public String street;
    public Address street(String street) {
        this.street = street;
        return this;
    }
    //
    public String zip;
    public Address zip(String zip) {
        this.zip = zip;
        return this;
    }
}

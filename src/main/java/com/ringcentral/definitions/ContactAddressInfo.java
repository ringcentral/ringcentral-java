package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ContactAddressInfo
{
    // Country name of extension user company. Not returned for Address Book
    public String country;
    public ContactAddressInfo country(String country) {
        this.country = country;
        return this;
    }
    // State/province name of extension user company
    public String state;
    public ContactAddressInfo state(String state) {
        this.state = state;
        return this;
    }
    // City name of extension user company
    public String city;
    public ContactAddressInfo city(String city) {
        this.city = city;
        return this;
    }
    // Street address of extension user company
    public String street;
    public ContactAddressInfo street(String street) {
        this.street = street;
        return this;
    }
    // Zip code of extension user company
    public String zip;
    public ContactAddressInfo zip(String zip) {
        this.zip = zip;
        return this;
    }
}

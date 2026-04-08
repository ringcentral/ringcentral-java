package com.ringcentral.definitions;

public class BusinessAddress {
    /** Street */
    public String street;

    public BusinessAddress street(String street) {
        this.street = street;
        return this;
    }

    /** City */
    public String city;

    public BusinessAddress city(String city) {
        this.city = city;
        return this;
    }

    /** State */
    public String state;

    public BusinessAddress state(String state) {
        this.state = state;
        return this;
    }

    /** ZIP code */
    public String zip;

    public BusinessAddress zip(String zip) {
        this.zip = zip;
        return this;
    }

    /** Country code */
    public String countryCode;

    public BusinessAddress countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
}

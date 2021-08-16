package com.ringcentral.definitions;


public class ContactAddressInfoResource {
    /**
     *
     */
    public String street;
    /**
     *
     */
    public String city;
    /**
     *
     */
    public String state;
    /**
     *
     */
    public String zip;
    /**
     *
     */
    public String country;

    public ContactAddressInfoResource street(String street) {
        this.street = street;
        return this;
    }

    public ContactAddressInfoResource city(String city) {
        this.city = city;
        return this;
    }

    public ContactAddressInfoResource state(String state) {
        this.state = state;
        return this;
    }

    public ContactAddressInfoResource zip(String zip) {
        this.zip = zip;
        return this;
    }

    public ContactAddressInfoResource country(String country) {
        this.country = country;
        return this;
    }
}

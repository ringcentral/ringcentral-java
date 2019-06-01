package com.ringcentral.definitions;


public class BusinessAddressInfo {
    /**
     * Name of a country
     */
    public String country;
    /**
     * Name of a state/province
     */
    public String state;
    /**
     * Name of a city
     */
    public String city;
    /**
     * Street address
     */
    public String street;
    /**
     * Zip code
     */
    public String zip;

    public BusinessAddressInfo country(String country) {
        this.country = country;
        return this;
    }

    public BusinessAddressInfo state(String state) {
        this.state = state;
        return this;
    }

    public BusinessAddressInfo city(String city) {
        this.city = city;
        return this;
    }

    public BusinessAddressInfo street(String street) {
        this.street = street;
        return this;
    }

    public BusinessAddressInfo zip(String zip) {
        this.zip = zip;
        return this;
    }

}

package com.ringcentral.definitions;


public class ShippingAddressInfo {
    /**
     * Name of a receiver
     */
    public String customerName;
    /**
     * Street address, line 1 - street address, P.O. box, company name, c/o
     */
    public String street;
    /**
     * Street address, line 2 - apartment, suite, unit, building, floor, etc.
     */
    public String street2;
    /**
     * City name
     */
    public String city;
    /**
     * State/province name
     */
    public String state;
    /**
     * Internal identifier of a state
     */
    public String stateId;
    /**
     * ISO code of a state
     */
    public String stateIsoCode;
    /**
     * Full name of a state
     */
    public String stateName;
    /**
     * Internal identifier of a country
     */
    public String countryId;
    /**
     * ISO code of a country
     */
    public String countryIsoCode;
    /**
     * Country name
     */
    public String country;
    /**
     * Full name of a country
     */
    public String countryName;
    /**
     * Zip code
     */
    public String zip;

    public ShippingAddressInfo customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public ShippingAddressInfo street(String street) {
        this.street = street;
        return this;
    }

    public ShippingAddressInfo street2(String street2) {
        this.street2 = street2;
        return this;
    }

    public ShippingAddressInfo city(String city) {
        this.city = city;
        return this;
    }

    public ShippingAddressInfo state(String state) {
        this.state = state;
        return this;
    }

    public ShippingAddressInfo stateId(String stateId) {
        this.stateId = stateId;
        return this;
    }

    public ShippingAddressInfo stateIsoCode(String stateIsoCode) {
        this.stateIsoCode = stateIsoCode;
        return this;
    }

    public ShippingAddressInfo stateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    public ShippingAddressInfo countryId(String countryId) {
        this.countryId = countryId;
        return this;
    }

    public ShippingAddressInfo countryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
        return this;
    }

    public ShippingAddressInfo country(String country) {
        this.country = country;
        return this;
    }

    public ShippingAddressInfo countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public ShippingAddressInfo zip(String zip) {
        this.zip = zip;
        return this;
    }

}

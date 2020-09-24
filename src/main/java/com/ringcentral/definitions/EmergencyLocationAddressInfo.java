package com.ringcentral.definitions;


public class EmergencyLocationAddressInfo {
    /**
     * Country name
     */
    public String country;
    /**
     * Internal identifier of a country
     */
    public String countryId;
    /**
     * ISO code of a country
     */
    public String countryIsoCode;
    /**
     * Full name of a country
     */
    public String countryName;
    /**
     * State/Province name. Mandatory for the USA, the UK and Canada
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
     * City name
     */
    public String city;
    /**
     * First line address
     */
    public String street;
    /**
     * Second line address (apartment, suite, unit, building, floor, etc.)
     */
    public String street2;
    /**
     * Postal (Zip) code
     */
    public String zip;
    /**
     * Customer name
     */
    public String customerName;

    public EmergencyLocationAddressInfo country(String country) {
        this.country = country;
        return this;
    }

    public EmergencyLocationAddressInfo countryId(String countryId) {
        this.countryId = countryId;
        return this;
    }

    public EmergencyLocationAddressInfo countryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
        return this;
    }

    public EmergencyLocationAddressInfo countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public EmergencyLocationAddressInfo state(String state) {
        this.state = state;
        return this;
    }

    public EmergencyLocationAddressInfo stateId(String stateId) {
        this.stateId = stateId;
        return this;
    }

    public EmergencyLocationAddressInfo stateIsoCode(String stateIsoCode) {
        this.stateIsoCode = stateIsoCode;
        return this;
    }

    public EmergencyLocationAddressInfo stateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    public EmergencyLocationAddressInfo city(String city) {
        this.city = city;
        return this;
    }

    public EmergencyLocationAddressInfo street(String street) {
        this.street = street;
        return this;
    }

    public EmergencyLocationAddressInfo street2(String street2) {
        this.street2 = street2;
        return this;
    }

    public EmergencyLocationAddressInfo zip(String zip) {
        this.zip = zip;
        return this;
    }

    public EmergencyLocationAddressInfo customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

}

package com.ringcentral.definitions;


public class DeviceEmergencyAddress {
    /**
     * Name of a customer
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
     * Zip code
     */
    public String zip;
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

    public DeviceEmergencyAddress customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public DeviceEmergencyAddress street(String street) {
        this.street = street;
        return this;
    }

    public DeviceEmergencyAddress street2(String street2) {
        this.street2 = street2;
        return this;
    }

    public DeviceEmergencyAddress city(String city) {
        this.city = city;
        return this;
    }

    public DeviceEmergencyAddress zip(String zip) {
        this.zip = zip;
        return this;
    }

    public DeviceEmergencyAddress state(String state) {
        this.state = state;
        return this;
    }

    public DeviceEmergencyAddress stateId(String stateId) {
        this.stateId = stateId;
        return this;
    }

    public DeviceEmergencyAddress stateIsoCode(String stateIsoCode) {
        this.stateIsoCode = stateIsoCode;
        return this;
    }

    public DeviceEmergencyAddress stateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    public DeviceEmergencyAddress countryId(String countryId) {
        this.countryId = countryId;
        return this;
    }

    public DeviceEmergencyAddress countryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
        return this;
    }

    public DeviceEmergencyAddress country(String country) {
        this.country = country;
        return this;
    }

    public DeviceEmergencyAddress countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

}

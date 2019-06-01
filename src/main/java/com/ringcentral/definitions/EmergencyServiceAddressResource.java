package com.ringcentral.definitions;


public class EmergencyServiceAddressResource {
    /**
     *
     */
    public String street;
    /**
     *
     */
    public String street2;
    /**
     *
     */
    public String city;
    /**
     *
     */
    public String zip;
    /**
     *
     */
    public String customerName;
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

    public EmergencyServiceAddressResource street(String street) {
        this.street = street;
        return this;
    }

    public EmergencyServiceAddressResource street2(String street2) {
        this.street2 = street2;
        return this;
    }

    public EmergencyServiceAddressResource city(String city) {
        this.city = city;
        return this;
    }

    public EmergencyServiceAddressResource zip(String zip) {
        this.zip = zip;
        return this;
    }

    public EmergencyServiceAddressResource customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public EmergencyServiceAddressResource state(String state) {
        this.state = state;
        return this;
    }

    public EmergencyServiceAddressResource stateId(String stateId) {
        this.stateId = stateId;
        return this;
    }

    public EmergencyServiceAddressResource stateIsoCode(String stateIsoCode) {
        this.stateIsoCode = stateIsoCode;
        return this;
    }

    public EmergencyServiceAddressResource stateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    public EmergencyServiceAddressResource countryId(String countryId) {
        this.countryId = countryId;
        return this;
    }

    public EmergencyServiceAddressResource countryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
        return this;
    }

    public EmergencyServiceAddressResource country(String country) {
        this.country = country;
        return this;
    }

    public EmergencyServiceAddressResource countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

}

package com.ringcentral.definitions;


public class EmergencyAddressInfo {
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
    /**
     * Resulting status of emergency address synchronization. Returned for 'Get Device Info' request if `syncEmergencyAddress` parameter is set to 'True'
     * Enum: Verified, Updated, Deleted, NotRequired, Unsupported, Failed
     */
    public String syncStatus;

    public EmergencyAddressInfo customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public EmergencyAddressInfo street(String street) {
        this.street = street;
        return this;
    }

    public EmergencyAddressInfo street2(String street2) {
        this.street2 = street2;
        return this;
    }

    public EmergencyAddressInfo city(String city) {
        this.city = city;
        return this;
    }

    public EmergencyAddressInfo zip(String zip) {
        this.zip = zip;
        return this;
    }

    public EmergencyAddressInfo state(String state) {
        this.state = state;
        return this;
    }

    public EmergencyAddressInfo stateId(String stateId) {
        this.stateId = stateId;
        return this;
    }

    public EmergencyAddressInfo stateIsoCode(String stateIsoCode) {
        this.stateIsoCode = stateIsoCode;
        return this;
    }

    public EmergencyAddressInfo stateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    public EmergencyAddressInfo countryId(String countryId) {
        this.countryId = countryId;
        return this;
    }

    public EmergencyAddressInfo countryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
        return this;
    }

    public EmergencyAddressInfo country(String country) {
        this.country = country;
        return this;
    }

    public EmergencyAddressInfo countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public EmergencyAddressInfo syncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

}

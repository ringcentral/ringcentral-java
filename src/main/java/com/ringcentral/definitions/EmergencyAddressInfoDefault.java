package com.ringcentral.definitions;


/**
 * Emergency address information (or information assigned to the
 * switch or wireless point - in case of using them). Only one of a pair
 * `emergencyAddress` or `emergencyLocationId` should be specified,
 * otherwise an error is returned
 */
public class EmergencyAddressInfoDefault {
    /**
     * Name of a customer
     */
    public String customerName;
    /**
     * Street address, line 1 - street address, P.O. box, company
     * name, c/o
     */
    public String street;
    /**
     * Street address, line 2 - apartment, suite, unit, building,
     * floor, etc.
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
     * Resulting status of emergency address synchronization. Returned
     * for &#039;Get Device Info&#039; request if `syncEmergencyAddress` parameter is set
     * to &#039;True&#039;
     * Enum: Verified, Updated, Deleted, NotRequired, Unsupported, Failed
     */
    public String syncStatus;

    public EmergencyAddressInfoDefault customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public EmergencyAddressInfoDefault street(String street) {
        this.street = street;
        return this;
    }

    public EmergencyAddressInfoDefault street2(String street2) {
        this.street2 = street2;
        return this;
    }

    public EmergencyAddressInfoDefault city(String city) {
        this.city = city;
        return this;
    }

    public EmergencyAddressInfoDefault zip(String zip) {
        this.zip = zip;
        return this;
    }

    public EmergencyAddressInfoDefault state(String state) {
        this.state = state;
        return this;
    }

    public EmergencyAddressInfoDefault stateId(String stateId) {
        this.stateId = stateId;
        return this;
    }

    public EmergencyAddressInfoDefault stateIsoCode(String stateIsoCode) {
        this.stateIsoCode = stateIsoCode;
        return this;
    }

    public EmergencyAddressInfoDefault stateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    public EmergencyAddressInfoDefault countryId(String countryId) {
        this.countryId = countryId;
        return this;
    }

    public EmergencyAddressInfoDefault countryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
        return this;
    }

    public EmergencyAddressInfoDefault country(String country) {
        this.country = country;
        return this;
    }

    public EmergencyAddressInfoDefault countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public EmergencyAddressInfoDefault syncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }
}

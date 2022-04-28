package com.ringcentral.definitions;


/**
 * Emergency address information (or information assigned to the switch or wireless point - in case of using them). Only one of a pair `emergencyAddress` or `emergencyLocationId` should be specified, otherwise the error is returned
 */
public class LocationUpdatesEmergencyAddressInfo {
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
     * Customer name
     */
    public String customerName;
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

    public LocationUpdatesEmergencyAddressInfo country(String country) {
        this.country = country;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfo countryId(String countryId) {
        this.countryId = countryId;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfo countryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfo countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfo customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfo state(String state) {
        this.state = state;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfo stateId(String stateId) {
        this.stateId = stateId;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfo stateIsoCode(String stateIsoCode) {
        this.stateIsoCode = stateIsoCode;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfo stateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfo city(String city) {
        this.city = city;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfo street(String street) {
        this.street = street;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfo street2(String street2) {
        this.street2 = street2;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfo zip(String zip) {
        this.zip = zip;
        return this;
    }
}

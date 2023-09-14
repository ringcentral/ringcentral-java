package com.ringcentral.definitions;


/**
 * Emergency address information (or information assigned to the switch or
 * wireless point - in case of using them). Only one of a pair `emergencyAddress`
 * or `emergencyLocationId` should be specified, otherwise an error is returned
 */
public class LocationUpdatesEmergencyAddressInfoFr {
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
    /**
     * (Optional) Building name
     */
    public String buildingName;
    /**
     * Building/street number
     */
    public String buildingNumber;

    public LocationUpdatesEmergencyAddressInfoFr country(String country) {
        this.country = country;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoFr countryId(String countryId) {
        this.countryId = countryId;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoFr countryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoFr countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoFr customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoFr state(String state) {
        this.state = state;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoFr stateId(String stateId) {
        this.stateId = stateId;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoFr stateIsoCode(String stateIsoCode) {
        this.stateIsoCode = stateIsoCode;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoFr stateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoFr city(String city) {
        this.city = city;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoFr street(String street) {
        this.street = street;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoFr street2(String street2) {
        this.street2 = street2;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoFr zip(String zip) {
        this.zip = zip;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoFr buildingName(String buildingName) {
        this.buildingName = buildingName;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoFr buildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
        return this;
    }
}

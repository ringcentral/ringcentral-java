package com.ringcentral.definitions;


/**
 * Emergency address information (or information assigned to the switch or
 * wireless point - in case of using them). Only one of a pair `emergencyAddress`
 * or `emergencyLocationId` should be specified, otherwise an error is returned
 */
public class LocationUpdatesEmergencyAddressInfoAu {
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
     * Street type
     */
    public String streetType;
    /**
     * Building/street number
     */
    public String buildingNumber;

    public LocationUpdatesEmergencyAddressInfoAu country(String country) {
        this.country = country;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoAu countryId(String countryId) {
        this.countryId = countryId;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoAu countryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoAu countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoAu customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoAu state(String state) {
        this.state = state;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoAu stateId(String stateId) {
        this.stateId = stateId;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoAu stateIsoCode(String stateIsoCode) {
        this.stateIsoCode = stateIsoCode;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoAu stateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoAu city(String city) {
        this.city = city;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoAu street(String street) {
        this.street = street;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoAu street2(String street2) {
        this.street2 = street2;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoAu zip(String zip) {
        this.zip = zip;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoAu buildingName(String buildingName) {
        this.buildingName = buildingName;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoAu streetType(String streetType) {
        this.streetType = streetType;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoAu buildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
        return this;
    }
}

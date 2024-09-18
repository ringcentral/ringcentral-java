package com.ringcentral.definitions;


/**
 * Emergency address assigned to the switch. Only one of a pair `emergencyAddress`
 * or `emergencyLocationId` should be specified, otherwise the error is returned
 */
public class LocationUpdatesEmergencyAddressInfoRequest {
    /**
     * Country name
     */
    public String country;
    /**
     * Internal identifier of a country
     */
    public String countryId;
    /**
     * Two-letter country code in [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format
     * Example: US
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
     * Second line address (apartment, suite, unit, building, floor,
     * etc.)
     */
    public String street2;
    /**
     * Postal (Zip) code
     */
    public String zip;

    public LocationUpdatesEmergencyAddressInfoRequest country(String country) {
        this.country = country;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoRequest countryId(String countryId) {
        this.countryId = countryId;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoRequest countryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoRequest countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoRequest customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoRequest state(String state) {
        this.state = state;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoRequest stateId(String stateId) {
        this.stateId = stateId;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoRequest stateIsoCode(String stateIsoCode) {
        this.stateIsoCode = stateIsoCode;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoRequest stateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoRequest city(String city) {
        this.city = city;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoRequest street(String street) {
        this.street = street;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoRequest street2(String street2) {
        this.street2 = street2;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoRequest zip(String zip) {
        this.zip = zip;
        return this;
    }
}

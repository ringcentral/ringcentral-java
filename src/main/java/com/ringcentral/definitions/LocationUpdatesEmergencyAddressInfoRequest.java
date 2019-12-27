package com.ringcentral.definitions;


public class LocationUpdatesEmergencyAddressInfoRequest {
    /**
     * Country name
     */
    public String country;
    /**
     * State/Province name. Mandatory for the USA, the UK and Canada
     */
    public String state;
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

    public LocationUpdatesEmergencyAddressInfoRequest country(String country) {
        this.country = country;
        return this;
    }

    public LocationUpdatesEmergencyAddressInfoRequest state(String state) {
        this.state = state;
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

package com.ringcentral.definitions;


public class EmergencyAddressInfoRequest {
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
     * Country name
     */
    public String country;

    public EmergencyAddressInfoRequest customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public EmergencyAddressInfoRequest street(String street) {
        this.street = street;
        return this;
    }

    public EmergencyAddressInfoRequest street2(String street2) {
        this.street2 = street2;
        return this;
    }

    public EmergencyAddressInfoRequest city(String city) {
        this.city = city;
        return this;
    }

    public EmergencyAddressInfoRequest zip(String zip) {
        this.zip = zip;
        return this;
    }

    public EmergencyAddressInfoRequest state(String state) {
        this.state = state;
        return this;
    }

    public EmergencyAddressInfoRequest country(String country) {
        this.country = country;
        return this;
    }

}

package com.ringcentral.definitions;

public class EmergencyAddressInfo {
    // Name of a customer
    public String customerName;
    // Street address, line 1 - street address, P.O. box, company name, c/o
    public String street;
    // Street address, line 2 - apartment, suite, unit, building, floor, etc.
    public String street2;
    // City name
    public String city;
    // State/province name
    public String state;
    // Zip code
    public String zip;
    // Country name
    public String country;

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

    public EmergencyAddressInfo state(String state) {
        this.state = state;
        return this;
    }

    public EmergencyAddressInfo zip(String zip) {
        this.zip = zip;
        return this;
    }

    public EmergencyAddressInfo country(String country) {
        this.country = country;
        return this;
    }
}

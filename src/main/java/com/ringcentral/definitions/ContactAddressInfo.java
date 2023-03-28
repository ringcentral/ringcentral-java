package com.ringcentral.definitions;


public class ContactAddressInfo {
    /**
     * Street address
     * Example: 20 Davis Dr.
     */
    public String street;
    /**
     * City name
     * Example: Belmont
     */
    public String city;
    /**
     * Country name
     */
    public String country;
    /**
     * State/province name
     * Example: CA
     */
    public String state;
    /**
     * Zip/Postal code
     * Example: 94002
     */
    public String zip;

    public ContactAddressInfo street(String street) {
        this.street = street;
        return this;
    }

    public ContactAddressInfo city(String city) {
        this.city = city;
        return this;
    }

    public ContactAddressInfo country(String country) {
        this.country = country;
        return this;
    }

    public ContactAddressInfo state(String state) {
        this.state = state;
        return this;
    }

    public ContactAddressInfo zip(String zip) {
        this.zip = zip;
        return this;
    }
}

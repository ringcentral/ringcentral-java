package com.ringcentral.definitions;


public class ContactAddressInfo {
    /**
     * Street address
     */
    public String street;
    /**
     * City name
     */
    public String city;
    /**
     * State/province name
     */
    public String state;
    /**
     * Zip/Postal code
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

    public ContactAddressInfo state(String state) {
        this.state = state;
        return this;
    }

    public ContactAddressInfo zip(String zip) {
        this.zip = zip;
        return this;
    }

}

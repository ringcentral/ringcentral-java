package com.ringcentral.definitions;


public class ContactBusinessAddressInfo {
    /**
     * Country name of an extension user company
     */
    public String country;
    /**
     * State/province name of an extension user company. Mandatory for the USA, UK and Canada
     */
    public String state;
    /**
     * City name of an extension user company
     */
    public String city;
    /**
     * Street address of an extension user company
     */
    public String street;
    /**
     * Zip code of an extension user company
     */
    public String zip;

    public ContactBusinessAddressInfo country(String country) {
        this.country = country;
        return this;
    }

    public ContactBusinessAddressInfo state(String state) {
        this.state = state;
        return this;
    }

    public ContactBusinessAddressInfo city(String city) {
        this.city = city;
        return this;
    }

    public ContactBusinessAddressInfo street(String street) {
        this.street = street;
        return this;
    }

    public ContactBusinessAddressInfo zip(String zip) {
        this.zip = zip;
        return this;
    }

}

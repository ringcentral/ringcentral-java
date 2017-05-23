package com.ringcentral.definitions;

public class ContactAddressInfo {
    // Country name of extension user company. Not returned for Address Book
    public String country;
    // State/province name of extension user company
    public String state;
    // City name of extension user company
    public String city;
    // Street address of extension user company
    public String street;
    // Zip code of extension user company
    public String zip;

    public ContactAddressInfo country(String country) {
        this.country = country;
        return this;
    }

    public ContactAddressInfo state(String state) {
        this.state = state;
        return this;
    }

    public ContactAddressInfo city(String city) {
        this.city = city;
        return this;
    }

    public ContactAddressInfo street(String street) {
        this.street = street;
        return this;
    }

    public ContactAddressInfo zip(String zip) {
        this.zip = zip;
        return this;
    }
}

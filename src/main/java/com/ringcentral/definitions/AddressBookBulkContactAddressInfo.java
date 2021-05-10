package com.ringcentral.definitions;


// Contact address information
public class AddressBookBulkContactAddressInfo {
    /**
     * Country name of extension user company. Not returned for Address Book
     */
    public String country;
    /**
     * State/province name of extension user company
     */
    public String state;
    /**
     * City name of extension user company
     */
    public String city;
    /**
     * Street address of extension user company
     */
    public String street;
    /**
     * Zip code of extension user company
     */
    public String zip;

    public AddressBookBulkContactAddressInfo country(String country) {
        this.country = country;
        return this;
    }

    public AddressBookBulkContactAddressInfo state(String state) {
        this.state = state;
        return this;
    }

    public AddressBookBulkContactAddressInfo city(String city) {
        this.city = city;
        return this;
    }

    public AddressBookBulkContactAddressInfo street(String street) {
        this.street = street;
        return this;
    }

    public AddressBookBulkContactAddressInfo zip(String zip) {
        this.zip = zip;
        return this;
    }
}

package com.ringcentral.definitions;


public class AddressBookBulkContactAddressInfo
{
    /**
     * Country name of the extension user company. Not returned for Address
    * Book
     */
    public String country;
    public AddressBookBulkContactAddressInfo country(String country)
    {
        this.country = country;
        return this;
    }

    /**
     * State/province name of the extension user company
     */
    public String state;
    public AddressBookBulkContactAddressInfo state(String state)
    {
        this.state = state;
        return this;
    }

    /**
     * City name of the extension user company
     */
    public String city;
    public AddressBookBulkContactAddressInfo city(String city)
    {
        this.city = city;
        return this;
    }

    /**
     * Street address of the extension user company
     */
    public String street;
    public AddressBookBulkContactAddressInfo street(String street)
    {
        this.street = street;
        return this;
    }

    /**
     * Zip code of the extension user company
     */
    public String zip;
    public AddressBookBulkContactAddressInfo zip(String zip)
    {
        this.zip = zip;
        return this;
    }
}
package com.ringcentral.definitions;


    /**
* Extension user business address. The default is
* Company (Auto-Receptionist) settings
* 
*/
public class ContactBusinessAddressInfo
{
    /**
     * Country name of an extension user company
     */
    public String country;
    public ContactBusinessAddressInfo country(String country)
    {
        this.country = country;
        return this;
    }

    /**
     * State/province name of an extension user company. Mandatory
    * for the USA, UK and Canada
     */
    public String state;
    public ContactBusinessAddressInfo state(String state)
    {
        this.state = state;
        return this;
    }

    /**
     * City name of an extension user company
     */
    public String city;
    public ContactBusinessAddressInfo city(String city)
    {
        this.city = city;
        return this;
    }

    /**
     * Street address of an extension user company
     */
    public String street;
    public ContactBusinessAddressInfo street(String street)
    {
        this.street = street;
        return this;
    }

    /**
     * Zip code of an extension user company
     */
    public String zip;
    public ContactBusinessAddressInfo zip(String zip)
    {
        this.zip = zip;
        return this;
    }
}
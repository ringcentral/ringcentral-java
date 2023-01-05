package com.ringcentral.definitions;


public class ContactAddressInfoResource
{
    /**
     */
    public String street;
    public ContactAddressInfoResource street(String street)
    {
        this.street = street;
        return this;
    }

    /**
     */
    public String city;
    public ContactAddressInfoResource city(String city)
    {
        this.city = city;
        return this;
    }

    /**
     */
    public String state;
    public ContactAddressInfoResource state(String state)
    {
        this.state = state;
        return this;
    }

    /**
     */
    public String zip;
    public ContactAddressInfoResource zip(String zip)
    {
        this.zip = zip;
        return this;
    }

    /**
     */
    public String country;
    public ContactAddressInfoResource country(String country)
    {
        this.country = country;
        return this;
    }
}
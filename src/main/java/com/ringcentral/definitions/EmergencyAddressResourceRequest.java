package com.ringcentral.definitions;


public class EmergencyAddressResourceRequest
{
    /**
     * Country name
     */
    public String country;
    public EmergencyAddressResourceRequest country(String country)
    {
        this.country = country;
        return this;
    }

    /**
     * Internal identifier of a country
     */
    public String countryId;
    public EmergencyAddressResourceRequest countryId(String countryId)
    {
        this.countryId = countryId;
        return this;
    }

    /**
     * State/Province name. Mandatory for the USA, the UK and Canada
     */
    public String state;
    public EmergencyAddressResourceRequest state(String state)
    {
        this.state = state;
        return this;
    }

    /**
     * Internal identifier of a state
     */
    public String stateId;
    public EmergencyAddressResourceRequest stateId(String stateId)
    {
        this.stateId = stateId;
        return this;
    }

    /**
     * City name
     */
    public String city;
    public EmergencyAddressResourceRequest city(String city)
    {
        this.city = city;
        return this;
    }

    /**
     * First line address
     */
    public String street;
    public EmergencyAddressResourceRequest street(String street)
    {
        this.street = street;
        return this;
    }

    /**
     * Second line address (apartment, suite, unit, building, floor,
    * etc.)
     */
    public String street2;
    public EmergencyAddressResourceRequest street2(String street2)
    {
        this.street2 = street2;
        return this;
    }

    /**
     * Postal (Zip) code
     */
    public String zip;
    public EmergencyAddressResourceRequest zip(String zip)
    {
        this.zip = zip;
        return this;
    }

    /**
     * Customer name
     */
    public String customerName;
    public EmergencyAddressResourceRequest customerName(String customerName)
    {
        this.customerName = customerName;
        return this;
    }
}
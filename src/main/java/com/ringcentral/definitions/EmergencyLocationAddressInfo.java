package com.ringcentral.definitions;


public class EmergencyLocationAddressInfo
{
    /**
     * Country name
     */
    public String country;
    public EmergencyLocationAddressInfo country(String country)
    {
        this.country = country;
        return this;
    }

    /**
     * Internal identifier of a country
     */
    public String countryId;
    public EmergencyLocationAddressInfo countryId(String countryId)
    {
        this.countryId = countryId;
        return this;
    }

    /**
     * ISO code of a country
     */
    public String countryIsoCode;
    public EmergencyLocationAddressInfo countryIsoCode(String countryIsoCode)
    {
        this.countryIsoCode = countryIsoCode;
        return this;
    }

    /**
     * Full name of a country
     */
    public String countryName;
    public EmergencyLocationAddressInfo countryName(String countryName)
    {
        this.countryName = countryName;
        return this;
    }

    /**
     * State/Province name. Mandatory for the USA, the UK and Canada
     */
    public String state;
    public EmergencyLocationAddressInfo state(String state)
    {
        this.state = state;
        return this;
    }

    /**
     * Internal identifier of a state
     */
    public String stateId;
    public EmergencyLocationAddressInfo stateId(String stateId)
    {
        this.stateId = stateId;
        return this;
    }

    /**
     * ISO code of a state
     */
    public String stateIsoCode;
    public EmergencyLocationAddressInfo stateIsoCode(String stateIsoCode)
    {
        this.stateIsoCode = stateIsoCode;
        return this;
    }

    /**
     * Full name of a state
     */
    public String stateName;
    public EmergencyLocationAddressInfo stateName(String stateName)
    {
        this.stateName = stateName;
        return this;
    }

    /**
     * City name
     */
    public String city;
    public EmergencyLocationAddressInfo city(String city)
    {
        this.city = city;
        return this;
    }

    /**
     * First line address
     */
    public String street;
    public EmergencyLocationAddressInfo street(String street)
    {
        this.street = street;
        return this;
    }

    /**
     * Second line address (apartment, suite, unit, building, floor,
    * etc.)
     */
    public String street2;
    public EmergencyLocationAddressInfo street2(String street2)
    {
        this.street2 = street2;
        return this;
    }

    /**
     * Postal (Zip) code
     */
    public String zip;
    public EmergencyLocationAddressInfo zip(String zip)
    {
        this.zip = zip;
        return this;
    }

    /**
     * Customer name
     */
    public String customerName;
    public EmergencyLocationAddressInfo customerName(String customerName)
    {
        this.customerName = customerName;
        return this;
    }
}
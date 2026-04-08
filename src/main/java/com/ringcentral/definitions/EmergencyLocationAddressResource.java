package com.ringcentral.definitions;


public class EmergencyLocationAddressResource
{
    /**
     * Country name
     */
    public String country;
    public EmergencyLocationAddressResource country(String country)
    {
        this.country = country;
        return this;
    }

    /**
     * Internal identifier of a country
     */
    public String countryId;
    public EmergencyLocationAddressResource countryId(String countryId)
    {
        this.countryId = countryId;
        return this;
    }

    /**
     * Two-letter country code in [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format
     * Example: US
     */
    public String countryIsoCode;
    public EmergencyLocationAddressResource countryIsoCode(String countryIsoCode)
    {
        this.countryIsoCode = countryIsoCode;
        return this;
    }

    /**
     * Full name of a country
     */
    public String countryName;
    public EmergencyLocationAddressResource countryName(String countryName)
    {
        this.countryName = countryName;
        return this;
    }

    /**
     * State/Province name. Mandatory for the USA, the UK and Canada
     */
    public String state;
    public EmergencyLocationAddressResource state(String state)
    {
        this.state = state;
        return this;
    }

    /**
     * Internal identifier of a state
     */
    public String stateId;
    public EmergencyLocationAddressResource stateId(String stateId)
    {
        this.stateId = stateId;
        return this;
    }

    /**
     * ISO code of a state
     */
    public String stateIsoCode;
    public EmergencyLocationAddressResource stateIsoCode(String stateIsoCode)
    {
        this.stateIsoCode = stateIsoCode;
        return this;
    }

    /**
     * Full name of a state
     */
    public String stateName;
    public EmergencyLocationAddressResource stateName(String stateName)
    {
        this.stateName = stateName;
        return this;
    }

    /**
     * City name
     */
    public String city;
    public EmergencyLocationAddressResource city(String city)
    {
        this.city = city;
        return this;
    }

    /**
     * First line address
     */
    public String street;
    public EmergencyLocationAddressResource street(String street)
    {
        this.street = street;
        return this;
    }

    /**
     * Second line address (apartment, suite, unit, building, floor,
    * etc.)
     */
    public String street2;
    public EmergencyLocationAddressResource street2(String street2)
    {
        this.street2 = street2;
        return this;
    }

    /**
     * Postal (Zip) code
     */
    public String zip;
    public EmergencyLocationAddressResource zip(String zip)
    {
        this.zip = zip;
        return this;
    }

    /**
     * Customer name
     */
    public String customerName;
    public EmergencyLocationAddressResource customerName(String customerName)
    {
        this.customerName = customerName;
        return this;
    }

    /**
     * Specifies if the emergency address is out of country
     */
    public Boolean outOfCountry;
    public EmergencyLocationAddressResource outOfCountry(Boolean outOfCountry)
    {
        this.outOfCountry = outOfCountry;
        return this;
    }

    /**
     * (Optional) Building name
     */
    public String buildingName;
    public EmergencyLocationAddressResource buildingName(String buildingName)
    {
        this.buildingName = buildingName;
        return this;
    }

    /**
     * Street type
     */
    public String streetType;
    public EmergencyLocationAddressResource streetType(String streetType)
    {
        this.streetType = streetType;
        return this;
    }

    /**
     * Building/street number
     */
    public String buildingNumber;
    public EmergencyLocationAddressResource buildingNumber(String buildingNumber)
    {
        this.buildingNumber = buildingNumber;
        return this;
    }
}
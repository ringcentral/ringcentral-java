package com.ringcentral.definitions;


public class ScimUserAddress
{
    /**
     */
    public String country;
    public ScimUserAddress country(String country)
    {
        this.country = country;
        return this;
    }

    /**
     */
    public String locality;
    public ScimUserAddress locality(String locality)
    {
        this.locality = locality;
        return this;
    }

    /**
     */
    public String postalCode;
    public ScimUserAddress postalCode(String postalCode)
    {
        this.postalCode = postalCode;
        return this;
    }

    /**
     */
    public String region;
    public ScimUserAddress region(String region)
    {
        this.region = region;
        return this;
    }

    /**
     */
    public String streetAddress;
    public ScimUserAddress streetAddress(String streetAddress)
    {
        this.streetAddress = streetAddress;
        return this;
    }

    /**
     * Required
     * Enum: work
     */
    public String type;
    public ScimUserAddress type(String type)
    {
        this.type = type;
        return this;
    }
}
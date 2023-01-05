package com.ringcentral.definitions;


public class GetCountryInfoNumberParser
{
    /**
     * Internal identifier of a country
     */
    public String id;
    public GetCountryInfoNumberParser id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Canonical URI of a country resource
     * Format: uri
     */
    public String uri;
    public GetCountryInfoNumberParser uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Country calling code defined by ITU-T recommendations `E.123`
    * and `E.164`, see Calling Codes
     * Example: 1
     */
    public String callingCode;
    public GetCountryInfoNumberParser callingCode(String callingCode)
    {
        this.callingCode = callingCode;
        return this;
    }

    /**
     * Country code in `ISO 3166` alpha-2 format
     * Example: US
     */
    public String isoCode;
    public GetCountryInfoNumberParser isoCode(String isoCode)
    {
        this.isoCode = isoCode;
        return this;
    }

    /**
     * The official name of the country.
     * Example: United States
     */
    public String name;
    public GetCountryInfoNumberParser name(String name)
    {
        this.name = name;
        return this;
    }
}
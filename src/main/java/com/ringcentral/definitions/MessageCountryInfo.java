package com.ringcentral.definitions;


public class MessageCountryInfo
{
    /**
     * Internal identifier of a country
     */
    public String id;
    public MessageCountryInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Canonical URI of a country
     */
    public String uri;
    public MessageCountryInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Official name of a country
     */
    public String name;
    public MessageCountryInfo name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * ISO code of a country
     */
    public String isoCode;
    public MessageCountryInfo isoCode(String isoCode)
    {
        this.isoCode = isoCode;
        return this;
    }

    /**
     * Calling code of a country
     */
    public String callingCode;
    public MessageCountryInfo callingCode(String callingCode)
    {
        this.callingCode = callingCode;
        return this;
    }
}
package com.ringcentral.definitions;


public class CountryInfoBasicModel
{
    /**
     * Internal identifier of a country
     */
    public String id;
    public CountryInfoBasicModel id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Canonical URI of a country resource
     * Format: uri
     */
    public String uri;
    public CountryInfoBasicModel uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * The official name of a country
     */
    public String name;
    public CountryInfoBasicModel name(String name)
    {
        this.name = name;
        return this;
    }
}
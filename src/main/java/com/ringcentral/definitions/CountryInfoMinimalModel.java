package com.ringcentral.definitions;


public class CountryInfoMinimalModel
{
    /**
     * Internal identifier of a country
     */
    public String id;
    public CountryInfoMinimalModel id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Canonical URI of a country resource
     * Format: uri
     */
    public String uri;
    public CountryInfoMinimalModel uri(String uri)
    {
        this.uri = uri;
        return this;
    }
}
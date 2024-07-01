package com.ringcentral.definitions;


public class ServiceInfoCountryShortModel
{
    /**
     * Internal identifier of a country
     */
    public String id;
    public ServiceInfoCountryShortModel id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Canonical URI of a country resource
     * Format: uri
     */
    public String uri;
    public ServiceInfoCountryShortModel uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * The official name of a country
     */
    public String name;
    public ServiceInfoCountryShortModel name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * A ISO country code value complying with the
    * [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)
    * format.
     */
    public String isoCode;
    public ServiceInfoCountryShortModel isoCode(String isoCode)
    {
        this.isoCode = isoCode;
        return this;
    }

    /**
     * Country calling code defined by [ITU-T](http://en.wikipedia.org/wiki/ITU-T)
    * recommendations [E.123](http://en.wikipedia.org/wiki/E.123) and
    * [E.164](http://en.wikipedia.org/wiki/E.164),
    * see [Calling Codes](http://en.wikipedia.org/wiki/List_of_country_calling_codes)
     */
    public String callingCode;
    public ServiceInfoCountryShortModel callingCode(String callingCode)
    {
        this.callingCode = callingCode;
        return this;
    }
}
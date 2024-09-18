package com.ringcentral.definitions;


public class CountryInfoShortModel {
    /**
     * Internal identifier of a country
     */
    public String id;
    /**
     * Canonical URI of a country resource
     * Format: uri
     */
    public String uri;
    /**
     * The official name of a country
     */
    public String name;
    /**
     * Two-letter country code in [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format
     * Example: US
     */
    public String isoCode;
    /**
     * Country calling code defined by [ITU-T](http://en.wikipedia.org/wiki/ITU-T)
     * recommendations, [E.123](http://en.wikipedia.org/wiki/E.123) and
     * [E.164](http://en.wikipedia.org/wiki/E.164).
     * See also [Calling Codes](http://en.wikipedia.org/wiki/List_of_country_calling_codes)
     */
    public String callingCode;

    public CountryInfoShortModel id(String id) {
        this.id = id;
        return this;
    }

    public CountryInfoShortModel uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CountryInfoShortModel name(String name) {
        this.name = name;
        return this;
    }

    public CountryInfoShortModel isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }

    public CountryInfoShortModel callingCode(String callingCode) {
        this.callingCode = callingCode;
        return this;
    }
}

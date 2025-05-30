package com.ringcentral.definitions;


public class CountryInfoShortModelV2 {
    /**
     * Internal identifier of a country
     */
    public String id;
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

    public CountryInfoShortModelV2 id(String id) {
        this.id = id;
        return this;
    }

    public CountryInfoShortModelV2 name(String name) {
        this.name = name;
        return this;
    }

    public CountryInfoShortModelV2 isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }

    public CountryInfoShortModelV2 callingCode(String callingCode) {
        this.callingCode = callingCode;
        return this;
    }
}

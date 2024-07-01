package com.ringcentral.definitions;


public class ServiceInfoCountryShortModel {
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
     * A ISO country code value complying with the
     * [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)
     * format.
     */
    public String isoCode;
    /**
     * Country calling code defined by [ITU-T](http://en.wikipedia.org/wiki/ITU-T)
     * recommendations [E.123](http://en.wikipedia.org/wiki/E.123) and
     * [E.164](http://en.wikipedia.org/wiki/E.164),
     * see [Calling Codes](http://en.wikipedia.org/wiki/List_of_country_calling_codes)
     */
    public String callingCode;

    public ServiceInfoCountryShortModel id(String id) {
        this.id = id;
        return this;
    }

    public ServiceInfoCountryShortModel uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ServiceInfoCountryShortModel name(String name) {
        this.name = name;
        return this;
    }

    public ServiceInfoCountryShortModel isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }

    public ServiceInfoCountryShortModel callingCode(String callingCode) {
        this.callingCode = callingCode;
        return this;
    }
}

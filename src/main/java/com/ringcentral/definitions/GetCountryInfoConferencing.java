package com.ringcentral.definitions;


public class GetCountryInfoConferencing {
    /**
     * Internal identifier of a country
     */
    public String id;
    /**
     * Canonical URI of a country
     */
    public String uri;
    /**
     * Country calling code defined by ITU-T recommendations [E.123](https://www.itu.int/rec/T-REC-E.123-200102-I/en) and [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I)
     */
    public String callingCode;
    /**
     * Emergency calling feature availability/emergency address requirement indicator
     */
    public Boolean emergencyCalling;
    /**
     * Country code according to the ISO standard, see [ISO 3166](https://www.iso.org/iso-3166-country-codes.html)
     */
    public String isoCode;
    /**
     * Official name of a country
     */
    public String name;

    public GetCountryInfoConferencing id(String id) {
        this.id = id;
        return this;
    }

    public GetCountryInfoConferencing uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetCountryInfoConferencing callingCode(String callingCode) {
        this.callingCode = callingCode;
        return this;
    }

    public GetCountryInfoConferencing emergencyCalling(Boolean emergencyCalling) {
        this.emergencyCalling = emergencyCalling;
        return this;
    }

    public GetCountryInfoConferencing isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }

    public GetCountryInfoConferencing name(String name) {
        this.name = name;
        return this;
    }

}

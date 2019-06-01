package com.ringcentral.definitions;


public class GetCountryInfoNumberParser {
    /**
     * Internal identifier of a country
     */
    public String id;
    /**
     * Canonical URI of a country
     */
    public String uri;
    /**
     * Country calling code defined by ITU-T recommendations E.123 and E.164, see Calling Codes
     */
    public String callingCode;
    /**
     * Emergency calling feature availability/emergency address requirement indicator
     */
    public Boolean emergencyCalling;
    /**
     * Country code according to the ISO standard, see ISO 3166
     */
    public String isoCode;
    /**
     * Official name of a country
     */
    public String name;

    public GetCountryInfoNumberParser id(String id) {
        this.id = id;
        return this;
    }

    public GetCountryInfoNumberParser uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetCountryInfoNumberParser callingCode(String callingCode) {
        this.callingCode = callingCode;
        return this;
    }

    public GetCountryInfoNumberParser emergencyCalling(Boolean emergencyCalling) {
        this.emergencyCalling = emergencyCalling;
        return this;
    }

    public GetCountryInfoNumberParser isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }

    public GetCountryInfoNumberParser name(String name) {
        this.name = name;
        return this;
    }

}

package com.ringcentral.definitions;


public class GetCountryInfoNumberParser {
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
     * Country calling code defined by ITU-T recommendations `E.123`
     * and `E.164`, see Calling Codes
     * Example: 1
     */
    public String callingCode;
    /**
     * Country code in `ISO 3166` alpha-2 format
     * Example: US
     */
    public String isoCode;
    /**
     * The official name of the country.
     * Example: United States
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

    public GetCountryInfoNumberParser isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }

    public GetCountryInfoNumberParser name(String name) {
        this.name = name;
        return this;
    }
}

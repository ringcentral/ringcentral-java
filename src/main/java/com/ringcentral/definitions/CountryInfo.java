package com.ringcentral.definitions;


public class CountryInfo {
    /**
     * Internal identifier of a home country
     */
    public String id;
    /**
     * Canonical URI of a home country
     */
    public String uri;
    /**
     * Official name of a home country
     */
    public String name;
    /**
     * ISO code of a country
     */
    public String isoCode;
    /**
     * Calling code of a country
     */
    public String callingCode;

    public CountryInfo id(String id) {
        this.id = id;
        return this;
    }

    public CountryInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CountryInfo name(String name) {
        this.name = name;
        return this;
    }

    public CountryInfo isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }

    public CountryInfo callingCode(String callingCode) {
        this.callingCode = callingCode;
        return this;
    }

}

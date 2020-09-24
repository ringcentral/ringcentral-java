package com.ringcentral.definitions;


public class MessageCountryInfo {
    /**
     * Internal identifier of a country
     */
    public String id;
    /**
     * Canonical URI of a country
     */
    public String uri;
    /**
     * Official name of a country
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

    public MessageCountryInfo id(String id) {
        this.id = id;
        return this;
    }

    public MessageCountryInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public MessageCountryInfo name(String name) {
        this.name = name;
        return this;
    }

    public MessageCountryInfo isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }

    public MessageCountryInfo callingCode(String callingCode) {
        this.callingCode = callingCode;
        return this;
    }

}

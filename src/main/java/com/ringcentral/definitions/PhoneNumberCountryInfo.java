package com.ringcentral.definitions;


public class PhoneNumberCountryInfo {
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

    public PhoneNumberCountryInfo id(String id) {
        this.id = id;
        return this;
    }

    public PhoneNumberCountryInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public PhoneNumberCountryInfo name(String name) {
        this.name = name;
        return this;
    }

}

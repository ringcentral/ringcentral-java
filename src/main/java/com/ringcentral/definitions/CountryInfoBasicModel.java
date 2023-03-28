package com.ringcentral.definitions;


public class CountryInfoBasicModel {
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

    public CountryInfoBasicModel id(String id) {
        this.id = id;
        return this;
    }

    public CountryInfoBasicModel uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CountryInfoBasicModel name(String name) {
        this.name = name;
        return this;
    }
}

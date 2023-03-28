package com.ringcentral.definitions;


public class CountryInfoMinimalModel {
    /**
     * Internal identifier of a country
     */
    public String id;
    /**
     * Canonical URI of a country resource
     * Format: uri
     */
    public String uri;

    public CountryInfoMinimalModel id(String id) {
        this.id = id;
        return this;
    }

    public CountryInfoMinimalModel uri(String uri) {
        this.uri = uri;
        return this;
    }
}

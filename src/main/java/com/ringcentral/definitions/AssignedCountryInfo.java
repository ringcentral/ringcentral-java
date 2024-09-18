package com.ringcentral.definitions;


/**
 * Information on a country assigned to an extension user. Returned for the User extension type only
 */
public class AssignedCountryInfo {
    /**
     * Internal identifier of an assigned country
     */
    public String id;
    /**
     * Canonical URI of an assigned country resource
     * Format: uri
     */
    public String uri;
    /**
     * Two-letter country code in [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format
     * Example: US
     */
    public String isoCode;
    /**
     * Official name of a country
     */
    public String name;

    public AssignedCountryInfo id(String id) {
        this.id = id;
        return this;
    }

    public AssignedCountryInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public AssignedCountryInfo isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }

    public AssignedCountryInfo name(String name) {
        this.name = name;
        return this;
    }
}

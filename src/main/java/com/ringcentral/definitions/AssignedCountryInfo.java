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
     */
    public String uri;
    /**
     * Country code according to the ISO standard, see [ISO 3166](https://www.iso.org/iso-3166-country-codes.html)
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

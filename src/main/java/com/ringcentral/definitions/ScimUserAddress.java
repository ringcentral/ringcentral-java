package com.ringcentral.definitions;


public class ScimUserAddress {
    /**
     *
     */
    public String country;
    /**
     *
     */
    public String locality;
    /**
     *
     */
    public String postalCode;
    /**
     *
     */
    public String region;
    /**
     *
     */
    public String streetAddress;
    /**
     * Required
     * Enum: work
     */
    public String type;

    public ScimUserAddress country(String country) {
        this.country = country;
        return this;
    }

    public ScimUserAddress locality(String locality) {
        this.locality = locality;
        return this;
    }

    public ScimUserAddress postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public ScimUserAddress region(String region) {
        this.region = region;
        return this;
    }

    public ScimUserAddress streetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
        return this;
    }

    public ScimUserAddress type(String type) {
        this.type = type;
        return this;
    }
}

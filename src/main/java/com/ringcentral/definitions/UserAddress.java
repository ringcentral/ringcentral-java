package com.ringcentral.definitions;


public class UserAddress {
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

    public UserAddress country(String country) {
        this.country = country;
        return this;
    }

    public UserAddress locality(String locality) {
        this.locality = locality;
        return this;
    }

    public UserAddress postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public UserAddress region(String region) {
        this.region = region;
        return this;
    }

    public UserAddress streetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
        return this;
    }

    public UserAddress type(String type) {
        this.type = type;
        return this;
    }

}

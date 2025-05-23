package com.ringcentral.definitions;


public class AccountCountryInfoRequest {
    /**
     * Internal identifier of a country
     * Required
     */
    public String id;
    /**
     * Two-letter country code in ISO 3166-1 alpha-2 format
     * Required
     */
    public String isoCode;

    public AccountCountryInfoRequest id(String id) {
        this.id = id;
        return this;
    }

    public AccountCountryInfoRequest isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }
}

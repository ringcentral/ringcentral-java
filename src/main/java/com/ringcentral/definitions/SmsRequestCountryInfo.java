package com.ringcentral.definitions;


/**
 * Target number country information. Either `id` or `isoCode` can be specified.
 */
public class SmsRequestCountryInfo {
    /**
     * Internal identifier of a country
     */
    public String id;
    /**
     * Two-letter country code in [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format
     * Example: US
     */
    public String isoCode;

    public SmsRequestCountryInfo id(String id) {
        this.id = id;
        return this;
    }

    public SmsRequestCountryInfo isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }
}

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
     * ISO 3166-1 alpha-2 code of a country
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

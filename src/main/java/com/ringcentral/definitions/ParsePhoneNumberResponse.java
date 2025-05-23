package com.ringcentral.definitions;


public class ParsePhoneNumberResponse {
    /**
     * Canonical URI of a resource
     * Format: uri
     */
    public String uri;
    /**
     *
     */
    public GetCountryInfoNumberParser homeCountry;
    /**
     * Parsed phone numbers information
     * Required
     */
    public PhoneNumberInfoNumberParser[] phoneNumbers;

    public ParsePhoneNumberResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ParsePhoneNumberResponse homeCountry(GetCountryInfoNumberParser homeCountry) {
        this.homeCountry = homeCountry;
        return this;
    }

    public ParsePhoneNumberResponse phoneNumbers(PhoneNumberInfoNumberParser[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
}

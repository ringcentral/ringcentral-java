package com.ringcentral.definitions;


public class ParsePhoneNumberResponse {
    /**
     * Canonical URI of a resource
     */
    public String uri;
    /**
     * Information on a user home country
     * Required
     */
    public GetCountryInfoNumberParser[] homeCountry;
    /**
     * Parsed phone numbers data
     * Required
     */
    public PhoneNumberInfoNumberParser[] phoneNumbers;

    public ParsePhoneNumberResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ParsePhoneNumberResponse homeCountry(GetCountryInfoNumberParser[] homeCountry) {
        this.homeCountry = homeCountry;
        return this;
    }

    public ParsePhoneNumberResponse phoneNumbers(PhoneNumberInfoNumberParser[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

}

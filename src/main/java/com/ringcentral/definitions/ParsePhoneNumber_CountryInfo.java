package com.ringcentral.definitions;

public class ParsePhoneNumber_CountryInfo {
    // Internal identifier of a country
    public String id;
    // Canonical URI of a country
    public String uri;
    // Country calling code defined by ITU-T recommendations E.123 and E.164, see Calling Codes
    public String callingCode;
    // Emergency calling feature availability/emergency address requirement indicator
    public Boolean emergencyCalling;
    // Country code according to the ISO standard, see ISO 3166
    public String isoCode;
    // Official name of a country
    public String name;

    public ParsePhoneNumber_CountryInfo id(String id) {
        this.id = id;
        return this;
    }

    public ParsePhoneNumber_CountryInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ParsePhoneNumber_CountryInfo callingCode(String callingCode) {
        this.callingCode = callingCode;
        return this;
    }

    public ParsePhoneNumber_CountryInfo emergencyCalling(Boolean emergencyCalling) {
        this.emergencyCalling = emergencyCalling;
        return this;
    }

    public ParsePhoneNumber_CountryInfo isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }

    public ParsePhoneNumber_CountryInfo name(String name) {
        this.name = name;
        return this;
    }
}

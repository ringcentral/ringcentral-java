package com.ringcentral.definitions;

public class DialInNumbers_CountryInfo {
    // Internal identifier of a country
    public String id;
    // Canonical URI of a country
    public String uri;
    // Country calling code defined by ITU-T recommendations E.123 and E.164, see Calling Codes
    public String callingCode;
    // Country code according to the ISO standard, see ISO 3166
    public String isoCode;
    // Official name of a country
    public String name;

    public DialInNumbers_CountryInfo id(String id) {
        this.id = id;
        return this;
    }

    public DialInNumbers_CountryInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public DialInNumbers_CountryInfo callingCode(String callingCode) {
        this.callingCode = callingCode;
        return this;
    }

    public DialInNumbers_CountryInfo isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }

    public DialInNumbers_CountryInfo name(String name) {
        this.name = name;
        return this;
    }
}

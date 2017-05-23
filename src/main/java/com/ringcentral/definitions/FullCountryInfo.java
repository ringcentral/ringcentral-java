package com.ringcentral.definitions;

public class FullCountryInfo {
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
    // Determines whether phone numbers are available for a country
    public Boolean numberSelling;
    // Specifies whether login with the phone numbers of this country is enabled or not
    public Boolean loginAllowed;
}

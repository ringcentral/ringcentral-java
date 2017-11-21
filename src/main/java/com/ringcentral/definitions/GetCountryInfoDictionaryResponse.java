package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GetCountryInfoDictionaryResponse
{
    // Internal identifier of a country
    public String id;
    public GetCountryInfoDictionaryResponse id(String id) {
        this.id = id;
        return this;
    }
    // Canonical URI of a country
    public String uri;
    public GetCountryInfoDictionaryResponse uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Country calling code defined by ITU-T recommendations E.123 and E.164, see Calling Codes
    public String callingCode;
    public GetCountryInfoDictionaryResponse callingCode(String callingCode) {
        this.callingCode = callingCode;
        return this;
    }
    // Emergency calling feature availability/emergency address requirement indicator
    public Boolean emergencyCalling;
    public GetCountryInfoDictionaryResponse emergencyCalling(Boolean emergencyCalling) {
        this.emergencyCalling = emergencyCalling;
        return this;
    }
    // Country code according to the ISO standard, see ISO 3166
    public String isoCode;
    public GetCountryInfoDictionaryResponse isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }
    // Official name of a country
    public String name;
    public GetCountryInfoDictionaryResponse name(String name) {
        this.name = name;
        return this;
    }
    // Determines whether phone numbers are available for a country
    public Boolean numberSelling;
    public GetCountryInfoDictionaryResponse numberSelling(Boolean numberSelling) {
        this.numberSelling = numberSelling;
        return this;
    }
    // Specifies whether login with the phone numbers of this country is enabled or not
    public Boolean loginAllowed;
    public GetCountryInfoDictionaryResponse loginAllowed(Boolean loginAllowed) {
        this.loginAllowed = loginAllowed;
        return this;
    }
    // Indicates whether signup/billing is allowed for a country
    public Boolean signupAllowed;
    public GetCountryInfoDictionaryResponse signupAllowed(Boolean signupAllowed) {
        this.signupAllowed = signupAllowed;
        return this;
    }
    // Specifies if free phone line for softphone is available for a country or not
    public Boolean freeSoftphoneLine;
    public GetCountryInfoDictionaryResponse freeSoftphoneLine(Boolean freeSoftphoneLine) {
        this.freeSoftphoneLine = freeSoftphoneLine;
        return this;
    }
}

package com.ringcentral.definitions;


public class GetCountryInfoDictionaryResponse {
    /**
     * Internal identifier of a country
     */
    public String id;
    /**
     * Canonical URI of a country
     */
    public String uri;
    /**
     * Country calling code defined by ITU-T recommendations [E.123](https://www.itu.int/rec/T-REC-E.123-200102-I/en) and [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I)
     */
    public String callingCode;
    /**
     * Emergency calling feature availability/emergency address requirement indicator
     */
    public Boolean emergencyCalling;
    /**
     * Country code according to the ISO standard, see [ISO 3166](https://www.iso.org/iso-3166-country-codes.html)
     */
    public String isoCode;
    /**
     * Official name of a country
     */
    public String name;
    /**
     * Determines whether phone numbers are available for a country
     */
    public Boolean numberSelling;
    /**
     * Specifies whether login with the phone numbers of this country is enabled or not
     */
    public Boolean loginAllowed;
    /**
     * Indicates whether signup/billing is allowed for a country
     */
    public Boolean signupAllowed;
    /**
     * Specifies if free phone line for softphone is available for a country or not
     */
    public Boolean freeSoftphoneLine;

    public GetCountryInfoDictionaryResponse id(String id) {
        this.id = id;
        return this;
    }

    public GetCountryInfoDictionaryResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetCountryInfoDictionaryResponse callingCode(String callingCode) {
        this.callingCode = callingCode;
        return this;
    }

    public GetCountryInfoDictionaryResponse emergencyCalling(Boolean emergencyCalling) {
        this.emergencyCalling = emergencyCalling;
        return this;
    }

    public GetCountryInfoDictionaryResponse isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }

    public GetCountryInfoDictionaryResponse name(String name) {
        this.name = name;
        return this;
    }

    public GetCountryInfoDictionaryResponse numberSelling(Boolean numberSelling) {
        this.numberSelling = numberSelling;
        return this;
    }

    public GetCountryInfoDictionaryResponse loginAllowed(Boolean loginAllowed) {
        this.loginAllowed = loginAllowed;
        return this;
    }

    public GetCountryInfoDictionaryResponse signupAllowed(Boolean signupAllowed) {
        this.signupAllowed = signupAllowed;
        return this;
    }

    public GetCountryInfoDictionaryResponse freeSoftphoneLine(Boolean freeSoftphoneLine) {
        this.freeSoftphoneLine = freeSoftphoneLine;
        return this;
    }

}

package com.ringcentral.definitions;


public class CountryInfoDictionaryModel {
    /**
     * Internal identifier of a country
     */
    public String id;
    /**
     * Canonical URI of a country resource
     * Format: uri
     */
    public String uri;
    /**
     * The official name of a country
     */
    public String name;
    /**
     * Two-letter country code in [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format
     * Example: US
     */
    public String isoCode;
    /**
     * Country calling code defined by [ITU-T](http://en.wikipedia.org/wiki/ITU-T)
     * recommendations, [E.123](http://en.wikipedia.org/wiki/E.123) and
     * [E.164](http://en.wikipedia.org/wiki/E.164).
     * See also [Calling Codes](http://en.wikipedia.org/wiki/List_of_country_calling_codes)
     */
    public String callingCode;
    /**
     * Emergency calling feature availability/emergency address requirement indicator
     */
    public Boolean emergencyCalling;
    /**
     * Indicates that phone numbers are available for this country
     */
    public Boolean numberSelling;
    /**
     * Indicates that login with the phone number of this country is allowed
     */
    public Boolean loginAllowed;
    /**
     * Indicates that signup/billing is allowed for this country
     */
    public Boolean signupAllowed;
    /**
     * Indicates that free phone line for softphone is available for this country
     */
    public Boolean freeSoftphoneLine;
    /**
     * Indicates that the local dialing is supported in this country and default area code can be set
     */
    public Boolean localDialing;

    public CountryInfoDictionaryModel id(String id) {
        this.id = id;
        return this;
    }

    public CountryInfoDictionaryModel uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CountryInfoDictionaryModel name(String name) {
        this.name = name;
        return this;
    }

    public CountryInfoDictionaryModel isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }

    public CountryInfoDictionaryModel callingCode(String callingCode) {
        this.callingCode = callingCode;
        return this;
    }

    public CountryInfoDictionaryModel emergencyCalling(Boolean emergencyCalling) {
        this.emergencyCalling = emergencyCalling;
        return this;
    }

    public CountryInfoDictionaryModel numberSelling(Boolean numberSelling) {
        this.numberSelling = numberSelling;
        return this;
    }

    public CountryInfoDictionaryModel loginAllowed(Boolean loginAllowed) {
        this.loginAllowed = loginAllowed;
        return this;
    }

    public CountryInfoDictionaryModel signupAllowed(Boolean signupAllowed) {
        this.signupAllowed = signupAllowed;
        return this;
    }

    public CountryInfoDictionaryModel freeSoftphoneLine(Boolean freeSoftphoneLine) {
        this.freeSoftphoneLine = freeSoftphoneLine;
        return this;
    }

    public CountryInfoDictionaryModel localDialing(Boolean localDialing) {
        this.localDialing = localDialing;
        return this;
    }
}

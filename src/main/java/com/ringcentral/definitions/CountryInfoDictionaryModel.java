package com.ringcentral.definitions;


public class CountryInfoDictionaryModel
{
    /**
     * Internal identifier of a country
     */
    public String id;
    public CountryInfoDictionaryModel id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Canonical URI of a country resource
     * Format: uri
     */
    public String uri;
    public CountryInfoDictionaryModel uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * The official name of a country
     */
    public String name;
    public CountryInfoDictionaryModel name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Country code according to the ISO standard, see
    * [ISO 3166](https://www.iso.org/iso-3166-country-codes.html)
     */
    public String isoCode;
    public CountryInfoDictionaryModel isoCode(String isoCode)
    {
        this.isoCode = isoCode;
        return this;
    }

    /**
     * Country calling code defined by [ITU-T](http://en.wikipedia.org/wiki/ITU-T)
    * recommendations [E.123](http://en.wikipedia.org/wiki/E.123) and
    * [E.164](http://en.wikipedia.org/wiki/E.164),
    * see [Calling Codes](http://en.wikipedia.org/wiki/List_of_country_calling_codes)
     */
    public String callingCode;
    public CountryInfoDictionaryModel callingCode(String callingCode)
    {
        this.callingCode = callingCode;
        return this;
    }

    /**
     * Emergency calling feature availability/emergency address requirement indicator
     */
    public Boolean emergencyCalling;
    public CountryInfoDictionaryModel emergencyCalling(Boolean emergencyCalling)
    {
        this.emergencyCalling = emergencyCalling;
        return this;
    }

    /**
     * Indicates that phone numbers are available for this country
     */
    public Boolean numberSelling;
    public CountryInfoDictionaryModel numberSelling(Boolean numberSelling)
    {
        this.numberSelling = numberSelling;
        return this;
    }

    /**
     * Indicates that login with the phone number of this country is allowed
     */
    public Boolean loginAllowed;
    public CountryInfoDictionaryModel loginAllowed(Boolean loginAllowed)
    {
        this.loginAllowed = loginAllowed;
        return this;
    }

    /**
     * Indicates that signup/billing is allowed for this country
     */
    public Boolean signupAllowed;
    public CountryInfoDictionaryModel signupAllowed(Boolean signupAllowed)
    {
        this.signupAllowed = signupAllowed;
        return this;
    }

    /**
     * Indicates that free phone line for softphone is available for this country
     */
    public Boolean freeSoftphoneLine;
    public CountryInfoDictionaryModel freeSoftphoneLine(Boolean freeSoftphoneLine)
    {
        this.freeSoftphoneLine = freeSoftphoneLine;
        return this;
    }

    /**
     * Indicates that the local dialing is supported in this country and default area code can be set
     */
    public Boolean localDialing;
    public CountryInfoDictionaryModel localDialing(Boolean localDialing)
    {
        this.localDialing = localDialing;
        return this;
    }
}
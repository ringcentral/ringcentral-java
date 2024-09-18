package com.ringcentral.definitions;


public class MeetingsCountryResource {
    /**
     * Format: uri
     */
    public String uri;
    /**
     *
     */
    public String id;
    /**
     *
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
     *
     */
    public Boolean emergencyCalling;
    /**
     *
     */
    public Boolean numberSelling;
    /**
     *
     */
    public Boolean loginAllowed;

    public MeetingsCountryResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public MeetingsCountryResource id(String id) {
        this.id = id;
        return this;
    }

    public MeetingsCountryResource name(String name) {
        this.name = name;
        return this;
    }

    public MeetingsCountryResource isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }

    public MeetingsCountryResource callingCode(String callingCode) {
        this.callingCode = callingCode;
        return this;
    }

    public MeetingsCountryResource emergencyCalling(Boolean emergencyCalling) {
        this.emergencyCalling = emergencyCalling;
        return this;
    }

    public MeetingsCountryResource numberSelling(Boolean numberSelling) {
        this.numberSelling = numberSelling;
        return this;
    }

    public MeetingsCountryResource loginAllowed(Boolean loginAllowed) {
        this.loginAllowed = loginAllowed;
        return this;
    }
}

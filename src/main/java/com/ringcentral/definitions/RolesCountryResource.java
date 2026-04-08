package com.ringcentral.definitions;

public class RolesCountryResource {
    /** Format: uri */
    public String uri;

    public RolesCountryResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    /** */
    public String id;

    public RolesCountryResource id(String id) {
        this.id = id;
        return this;
    }

    /** */
    public String name;

    public RolesCountryResource name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Two-letter country code in [ISO 3166-1
     * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format Example: US
     */
    public String isoCode;

    public RolesCountryResource isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }

    /**
     * Country calling code defined by [ITU-T](http://en.wikipedia.org/wiki/ITU-T) recommendations,
     * [E.123](http://en.wikipedia.org/wiki/E.123) and [E.164](http://en.wikipedia.org/wiki/E.164).
     * See also [Calling Codes](http://en.wikipedia.org/wiki/List_of_country_calling_codes)
     */
    public String callingCode;

    public RolesCountryResource callingCode(String callingCode) {
        this.callingCode = callingCode;
        return this;
    }

    /** */
    public Boolean emergencyCalling;

    public RolesCountryResource emergencyCalling(Boolean emergencyCalling) {
        this.emergencyCalling = emergencyCalling;
        return this;
    }

    /** */
    public Boolean numberSelling;

    public RolesCountryResource numberSelling(Boolean numberSelling) {
        this.numberSelling = numberSelling;
        return this;
    }

    /** */
    public Boolean loginAllowed;

    public RolesCountryResource loginAllowed(Boolean loginAllowed) {
        this.loginAllowed = loginAllowed;
        return this;
    }

    /** */
    public Boolean freeSoftphoneLine;

    public RolesCountryResource freeSoftphoneLine(Boolean freeSoftphoneLine) {
        this.freeSoftphoneLine = freeSoftphoneLine;
        return this;
    }

    /** */
    public Boolean signupAllowed;

    public RolesCountryResource signupAllowed(Boolean signupAllowed) {
        this.signupAllowed = signupAllowed;
        return this;
    }
}

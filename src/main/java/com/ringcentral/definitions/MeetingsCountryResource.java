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
     *
     */
    public String isoCode;
    /**
     *
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

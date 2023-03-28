package com.ringcentral.definitions;


public class RolesCountryResource {
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
    /**
     *
     */
    public Boolean freeSoftphoneLine;
    /**
     *
     */
    public Boolean signupAllowed;

    public RolesCountryResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public RolesCountryResource id(String id) {
        this.id = id;
        return this;
    }

    public RolesCountryResource name(String name) {
        this.name = name;
        return this;
    }

    public RolesCountryResource isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }

    public RolesCountryResource callingCode(String callingCode) {
        this.callingCode = callingCode;
        return this;
    }

    public RolesCountryResource emergencyCalling(Boolean emergencyCalling) {
        this.emergencyCalling = emergencyCalling;
        return this;
    }

    public RolesCountryResource numberSelling(Boolean numberSelling) {
        this.numberSelling = numberSelling;
        return this;
    }

    public RolesCountryResource loginAllowed(Boolean loginAllowed) {
        this.loginAllowed = loginAllowed;
        return this;
    }

    public RolesCountryResource freeSoftphoneLine(Boolean freeSoftphoneLine) {
        this.freeSoftphoneLine = freeSoftphoneLine;
        return this;
    }

    public RolesCountryResource signupAllowed(Boolean signupAllowed) {
        this.signupAllowed = signupAllowed;
        return this;
    }
}

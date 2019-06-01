package com.ringcentral.definitions;


public class CountryResource {
    /**
     *
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

    public CountryResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CountryResource id(String id) {
        this.id = id;
        return this;
    }

    public CountryResource name(String name) {
        this.name = name;
        return this;
    }

    public CountryResource isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }

    public CountryResource callingCode(String callingCode) {
        this.callingCode = callingCode;
        return this;
    }

    public CountryResource emergencyCalling(Boolean emergencyCalling) {
        this.emergencyCalling = emergencyCalling;
        return this;
    }

    public CountryResource numberSelling(Boolean numberSelling) {
        this.numberSelling = numberSelling;
        return this;
    }

    public CountryResource loginAllowed(Boolean loginAllowed) {
        this.loginAllowed = loginAllowed;
        return this;
    }

}

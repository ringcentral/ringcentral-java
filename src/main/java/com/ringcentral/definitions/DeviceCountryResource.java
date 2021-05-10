package com.ringcentral.definitions;


// Brief information on a phone number country
public class DeviceCountryResource {
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

    public DeviceCountryResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public DeviceCountryResource id(String id) {
        this.id = id;
        return this;
    }

    public DeviceCountryResource name(String name) {
        this.name = name;
        return this;
    }

    public DeviceCountryResource isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }

    public DeviceCountryResource callingCode(String callingCode) {
        this.callingCode = callingCode;
        return this;
    }

    public DeviceCountryResource emergencyCalling(Boolean emergencyCalling) {
        this.emergencyCalling = emergencyCalling;
        return this;
    }

    public DeviceCountryResource numberSelling(Boolean numberSelling) {
        this.numberSelling = numberSelling;
        return this;
    }

    public DeviceCountryResource loginAllowed(Boolean loginAllowed) {
        this.loginAllowed = loginAllowed;
        return this;
    }
}

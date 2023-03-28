package com.ringcentral.definitions;


/**
 * Brief information on a phone number country
 */
public class DevicePhoneNumberCountryInfo {
    /**
     * Internal identifier of a home country
     */
    public String id;
    /**
     * Canonical URI of a home country
     * Format: uri
     */
    public String uri;
    /**
     * Official name of a home country
     */
    public String name;

    public DevicePhoneNumberCountryInfo id(String id) {
        this.id = id;
        return this;
    }

    public DevicePhoneNumberCountryInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public DevicePhoneNumberCountryInfo name(String name) {
        this.name = name;
        return this;
    }
}

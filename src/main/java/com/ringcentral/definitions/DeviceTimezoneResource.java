package com.ringcentral.definitions;


public class DeviceTimezoneResource {
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
    public String description;

    public DeviceTimezoneResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public DeviceTimezoneResource id(String id) {
        this.id = id;
        return this;
    }

    public DeviceTimezoneResource name(String name) {
        this.name = name;
        return this;
    }

    public DeviceTimezoneResource description(String description) {
        this.description = description;
        return this;
    }
}

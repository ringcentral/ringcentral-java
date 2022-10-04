package com.ringcentral.definitions;


public class DeviceResourceSite {
    /**
     *
     */
    public String id;
    /**
     *
     */
    public String name;

    public DeviceResourceSite id(String id) {
        this.id = id;
        return this;
    }

    public DeviceResourceSite name(String name) {
        this.name = name;
        return this;
    }
}

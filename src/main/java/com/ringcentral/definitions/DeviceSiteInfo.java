package com.ringcentral.definitions;


public class DeviceSiteInfo {
    /**
     * Internal identifier of a site
     */
    public String id;
    /**
     * Name of a site
     */
    public String name;

    public DeviceSiteInfo id(String id) {
        this.id = id;
        return this;
    }

    public DeviceSiteInfo name(String name) {
        this.name = name;
        return this;
    }

}

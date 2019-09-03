package com.ringcentral.definitions;


public class AutomaticLocationUpdatesSiteInfo {
    /**
     * Internal identifier of a site
     */
    public String id;
    /**
     * Name of a site
     */
    public String name;

    public AutomaticLocationUpdatesSiteInfo id(String id) {
        this.id = id;
        return this;
    }

    public AutomaticLocationUpdatesSiteInfo name(String name) {
        this.name = name;
        return this;
    }

}

package com.ringcentral.definitions;


public class CallMonitoringGroupSite {
    /**
     * Identifier of a site
     */
    public String id;
    /**
     * Name of a site
     */
    public String name;

    public CallMonitoringGroupSite id(String id) {
        this.id = id;
        return this;
    }

    public CallMonitoringGroupSite name(String name) {
        this.name = name;
        return this;
    }
}

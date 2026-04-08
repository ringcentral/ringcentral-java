package com.ringcentral.definitions;

public class CallMonitoringGroupSite {
    /** Identifier of a site */
    public String id;

    public CallMonitoringGroupSite id(String id) {
        this.id = id;
        return this;
    }

    /** Name of a site */
    public String name;

    public CallMonitoringGroupSite name(String name) {
        this.name = name;
        return this;
    }
}

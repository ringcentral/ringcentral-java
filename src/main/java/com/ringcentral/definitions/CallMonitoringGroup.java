package com.ringcentral.definitions;


public class CallMonitoringGroup {
    /**
     * Internal identifier of a group
     */
    public String id;
    /**
     * Name of a group
     */
    public String name;

    public CallMonitoringGroup id(String id) {
        this.id = id;
        return this;
    }

    public CallMonitoringGroup name(String name) {
        this.name = name;
        return this;
    }

}

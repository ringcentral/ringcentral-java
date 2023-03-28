package com.ringcentral.definitions;


public class CallMonitoringGroup {
    /**
     * Link to a call monitoring group resource
     * Format: uri
     */
    public String uri;
    /**
     * Internal identifier of a group
     */
    public String id;
    /**
     * Name of a group
     */
    public String name;

    public CallMonitoringGroup uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CallMonitoringGroup id(String id) {
        this.id = id;
        return this;
    }

    public CallMonitoringGroup name(String name) {
        this.name = name;
        return this;
    }
}

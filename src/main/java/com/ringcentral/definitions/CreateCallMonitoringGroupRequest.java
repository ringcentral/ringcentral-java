package com.ringcentral.definitions;


public class CreateCallMonitoringGroupRequest {
    /**
     * Internal identifier of a group
     */
    public String id;
    /**
     * Name of a group
     * Required
     */
    public String name;

    public CreateCallMonitoringGroupRequest id(String id) {
        this.id = id;
        return this;
    }

    public CreateCallMonitoringGroupRequest name(String name) {
        this.name = name;
        return this;
    }

}

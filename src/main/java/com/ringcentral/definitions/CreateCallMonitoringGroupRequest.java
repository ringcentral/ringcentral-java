package com.ringcentral.definitions;


public class CreateCallMonitoringGroupRequest {
    /**
     * Name of a group
     * Required
     */
    public String name;
    /**
     *
     */
    public CreateCallMonitoringGroupRequestSite site;

    public CreateCallMonitoringGroupRequest name(String name) {
        this.name = name;
        return this;
    }

    public CreateCallMonitoringGroupRequest site(CreateCallMonitoringGroupRequestSite site) {
        this.site = site;
        return this;
    }
}

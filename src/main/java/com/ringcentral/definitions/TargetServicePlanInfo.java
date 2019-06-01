package com.ringcentral.definitions;


public class TargetServicePlanInfo {
    /**
     * Internal identifier of a target service plan
     */
    public String id;
    /**
     * Name of a target service plan
     */
    public String name;

    public TargetServicePlanInfo id(String id) {
        this.id = id;
        return this;
    }

    public TargetServicePlanInfo name(String name) {
        this.name = name;
        return this;
    }

}

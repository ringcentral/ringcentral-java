package com.ringcentral.definitions;


/**
 * Information on account service plan
 */
public class ServiceInfoPlanV2 {
    /**
     * Internal identifier of a service plan
     */
    public String id;
    /**
     * Name of a service plan
     */
    public String name;

    public ServiceInfoPlanV2 id(String id) {
        this.id = id;
        return this;
    }

    public ServiceInfoPlanV2 name(String name) {
        this.name = name;
        return this;
    }
}

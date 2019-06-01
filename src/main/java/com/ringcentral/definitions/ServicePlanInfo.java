package com.ringcentral.definitions;


public class ServicePlanInfo {
    /**
     * Internal identifier of a service plan
     */
    public String id;
    /**
     * Name of a service plan
     */
    public String name;
    /**
     * Edition of a service plan
     */
    public String edition;

    public ServicePlanInfo id(String id) {
        this.id = id;
        return this;
    }

    public ServicePlanInfo name(String name) {
        this.name = name;
        return this;
    }

    public ServicePlanInfo edition(String edition) {
        this.edition = edition;
        return this;
    }

}

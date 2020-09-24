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
    /**
     * Edition of a service plan
     */
    public String edition;
    /**
     * Enum: Freyja, Phoenix
     */
    public String freemiumProductType;

    public TargetServicePlanInfo id(String id) {
        this.id = id;
        return this;
    }

    public TargetServicePlanInfo name(String name) {
        this.name = name;
        return this;
    }

    public TargetServicePlanInfo edition(String edition) {
        this.edition = edition;
        return this;
    }

    public TargetServicePlanInfo freemiumProductType(String freemiumProductType) {
        this.freemiumProductType = freemiumProductType;
        return this;
    }

}

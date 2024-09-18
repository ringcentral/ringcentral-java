package com.ringcentral.definitions;


/**
 * Information on account service plan
 */
public class ServiceInfoPlan {
    /**
     * Internal identifier of a service plan
     */
    public String id;
    /**
     * Name of a service plan
     */
    public String name;
    /**
     * Enum: Freyja, Phoenix
     */
    public String freemiumProductType;

    public ServiceInfoPlan id(String id) {
        this.id = id;
        return this;
    }

    public ServiceInfoPlan name(String name) {
        this.name = name;
        return this;
    }

    public ServiceInfoPlan freemiumProductType(String freemiumProductType) {
        this.freemiumProductType = freemiumProductType;
        return this;
    }
}

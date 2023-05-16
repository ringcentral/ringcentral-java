package com.ringcentral.definitions;


/**
 * Internal RC "brand" information
 */
public class ServiceInfoBrand {
    /**
     * RingCentral brand ID
     * Required
     * Example: 6699
     */
    public String id;
    /**
     * RingCentral brand name
     * Required
     * Example: Partner 1
     */
    public String name;

    public ServiceInfoBrand id(String id) {
        this.id = id;
        return this;
    }

    public ServiceInfoBrand name(String name) {
        this.name = name;
        return this;
    }
}

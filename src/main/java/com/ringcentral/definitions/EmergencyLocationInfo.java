package com.ringcentral.definitions;


/**
 * Emergency response location information
 */
public class EmergencyLocationInfo {
    /**
     * Internal identifier of an emergency response location
     * Required
     */
    public String id;
    /**
     * Emergency response location name
     */
    public String name;

    public EmergencyLocationInfo id(String id) {
        this.id = id;
        return this;
    }

    public EmergencyLocationInfo name(String name) {
        this.name = name;
        return this;
    }
}

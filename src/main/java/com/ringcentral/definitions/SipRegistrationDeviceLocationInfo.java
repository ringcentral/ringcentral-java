package com.ringcentral.definitions;


public class SipRegistrationDeviceLocationInfo {
    /**
     * Internal identifier of an emergency response location
     */
    public String id;
    /**
     * Emergency response location name
     */
    public String name;

    public SipRegistrationDeviceLocationInfo id(String id) {
        this.id = id;
        return this;
    }

    public SipRegistrationDeviceLocationInfo name(String name) {
        this.name = name;
        return this;
    }

}

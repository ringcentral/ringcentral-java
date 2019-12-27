package com.ringcentral.definitions;


public class EmergencyLocationInfoRequest {
    /**
     * Internal identifier of the emergency response location
     */
    public String id;
    /**
     *
     */
    public EmergencyLocationAddressInfoRequest address;

    public EmergencyLocationInfoRequest id(String id) {
        this.id = id;
        return this;
    }

    public EmergencyLocationInfoRequest address(EmergencyLocationAddressInfoRequest address) {
        this.address = address;
        return this;
    }

}

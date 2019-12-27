package com.ringcentral.definitions;


public class EmergencyLocationInfo {
    /**
     * Internal identifier of the emergency response location
     */
    public String id;
    /**
     *
     */
    public EmergencyLocationAddressInfo address;

    public EmergencyLocationInfo id(String id) {
        this.id = id;
        return this;
    }

    public EmergencyLocationInfo address(EmergencyLocationAddressInfo address) {
        this.address = address;
        return this;
    }

}

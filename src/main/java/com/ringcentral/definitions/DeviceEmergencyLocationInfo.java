package com.ringcentral.definitions;


/**
 * Company emergency response location details
 */
public class DeviceEmergencyLocationInfo {
    /**
     * Internal identifier of the emergency response location
     */
    public String id;
    /**
     * Location name
     */
    public String name;
    /**
     * Address format ID
     */
    public String addressFormatId;

    public DeviceEmergencyLocationInfo id(String id) {
        this.id = id;
        return this;
    }

    public DeviceEmergencyLocationInfo name(String name) {
        this.name = name;
        return this;
    }

    public DeviceEmergencyLocationInfo addressFormatId(String addressFormatId) {
        this.addressFormatId = addressFormatId;
        return this;
    }
}

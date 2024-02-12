package com.ringcentral.definitions;


/**
 * Company emergency response location details
 */
public class SipRegistrationDeviceLocationInfo {
    /**
     * Internal identifier of an emergency response location
     */
    public String id;
    /**
     * Emergency response location name
     */
    public String name;
    /**
     * Address format ID
     */
    public String addressFormatId;

    public SipRegistrationDeviceLocationInfo id(String id) {
        this.id = id;
        return this;
    }

    public SipRegistrationDeviceLocationInfo name(String name) {
        this.name = name;
        return this;
    }

    public SipRegistrationDeviceLocationInfo addressFormatId(String addressFormatId) {
        this.addressFormatId = addressFormatId;
        return this;
    }
}

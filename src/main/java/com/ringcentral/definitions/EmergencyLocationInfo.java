package com.ringcentral.definitions;

/** Emergency response location information */
public class EmergencyLocationInfo {
    /** Internal identifier of an emergency response location Required */
    public String id;

    public EmergencyLocationInfo id(String id) {
        this.id = id;
        return this;
    }

    /** Emergency response location name */
    public String name;

    public EmergencyLocationInfo name(String name) {
        this.name = name;
        return this;
    }

    /** Address format identifier */
    public String addressFormatId;

    public EmergencyLocationInfo addressFormatId(String addressFormatId) {
        this.addressFormatId = addressFormatId;
        return this;
    }

    /**
     * Emergency address status. Only supported for extension-level (personal) endpoints Enum:
     * Valid, Invalid, Provisioning, Deprovisioned
     */
    public String addressStatus;

    public EmergencyLocationInfo addressStatus(String addressStatus) {
        this.addressStatus = addressStatus;
        return this;
    }
}

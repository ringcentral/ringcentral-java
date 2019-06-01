package com.ringcentral.definitions;


public class DeviceInfoRequest {
    /**
     * Device unique identifier, retrieved on previous session (if any)
     */
    public String id;
    /**
     * For iOS devices only Certificate name (used by iOS applications for APNS subscription)
     */
    public String appExternalId;
    /**
     * For SoftPhone only Computer name
     */
    public String computerName;

    public DeviceInfoRequest id(String id) {
        this.id = id;
        return this;
    }

    public DeviceInfoRequest appExternalId(String appExternalId) {
        this.appExternalId = appExternalId;
        return this;
    }

    public DeviceInfoRequest computerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

}

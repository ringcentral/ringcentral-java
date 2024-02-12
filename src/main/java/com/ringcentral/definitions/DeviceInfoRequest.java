package com.ringcentral.definitions;


/**
 * Device information
 */
public class DeviceInfoRequest {
    /**
     * Device unique identifier, retrieved at previous session (if any)
     */
    public String id;
    /**
     * Supported for iOS devices only. Certificate name (used by iOS
     * applications for APNS subscription)
     */
    public String appExternalId;
    /**
     * Computer name (for devices of `SoftPhone` type only)
     */
    public String computerName;
    /**
     * Endpoint/device instance identifier for Softphone and mobile applications
     */
    public String serial;

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

    public DeviceInfoRequest serial(String serial) {
        this.serial = serial;
        return this;
    }
}

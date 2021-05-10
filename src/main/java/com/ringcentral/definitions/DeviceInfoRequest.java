package com.ringcentral.definitions;


// Device information
public class DeviceInfoRequest {
    /**
     * Device unique identifier, retrieved at previous session (if any)
     */
    public String id;
    /**
     * Supported for iOS devices only. Certificate name (used by iOS applications for APNS subscription)
     */
    public String appExternalId;
    /**
     * Supported for SoftPhone only. Computer name
     */
    public String computerName;
    /**
     * Serial number for HardPhone; `endpoint_id` for softphone and mobile applications. Returned only when the phone is shipped and provisioned
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

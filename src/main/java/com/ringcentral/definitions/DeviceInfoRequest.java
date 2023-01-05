package com.ringcentral.definitions;


    /**
* Device information
*/
public class DeviceInfoRequest
{
    /**
     * Device unique identifier, retrieved at previous session (if any)
     */
    public String id;
    public DeviceInfoRequest id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Supported for iOS devices only. Certificate name (used by iOS
    * applications for APNS subscription)
     */
    public String appExternalId;
    public DeviceInfoRequest appExternalId(String appExternalId)
    {
        this.appExternalId = appExternalId;
        return this;
    }

    /**
     * Computer name (for SoftPhone only).
     */
    public String computerName;
    public DeviceInfoRequest computerName(String computerName)
    {
        this.computerName = computerName;
        return this;
    }

    /**
     * Endpoint/device instance identifier for Softphone and mobile applications.
     */
    public String serial;
    public DeviceInfoRequest serial(String serial)
    {
        this.serial = serial;
        return this;
    }
}
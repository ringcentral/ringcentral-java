package com.ringcentral.definitions;


    /**
* Company emergency response location details
*/
public class DeviceEmergencyLocationInfo
{
    /**
     * Internal identifier of the emergency response location
     */
    public String id;
    public DeviceEmergencyLocationInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Location name
     */
    public String name;
    public DeviceEmergencyLocationInfo name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Address format ID
     */
    public String addressFormatId;
    public DeviceEmergencyLocationInfo addressFormatId(String addressFormatId)
    {
        this.addressFormatId = addressFormatId;
        return this;
    }

    /**
     * Address format statuses
     * Enum: Actual, Outdated, Deprecated
     */
    public String addressFormatStatus;
    public DeviceEmergencyLocationInfo addressFormatStatus(String addressFormatStatus)
    {
        this.addressFormatStatus = addressFormatStatus;
        return this;
    }
}
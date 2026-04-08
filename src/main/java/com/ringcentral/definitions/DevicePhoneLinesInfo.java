package com.ringcentral.definitions;


public class DevicePhoneLinesInfo
{
    /**
     * Internal identifier of a phone line
     */
    public String id;
    public DevicePhoneLinesInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Type of phone line
     * Enum: Standalone, StandaloneFree, BlaPrimary, BlaSecondary
     */
    public String lineType;
    public DevicePhoneLinesInfo lineType(String lineType)
    {
        this.lineType = lineType;
        return this;
    }

    /**
     */
    public DevicePhoneLinesEmergencyAddressInfo emergencyAddress;
    public DevicePhoneLinesInfo emergencyAddress(DevicePhoneLinesEmergencyAddressInfo emergencyAddress)
    {
        this.emergencyAddress = emergencyAddress;
        return this;
    }

    /**
     */
    public DevicePhoneNumberInfo phoneInfo;
    public DevicePhoneLinesInfo phoneInfo(DevicePhoneNumberInfo phoneInfo)
    {
        this.phoneInfo = phoneInfo;
        return this;
    }
}
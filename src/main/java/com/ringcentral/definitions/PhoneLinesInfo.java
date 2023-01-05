package com.ringcentral.definitions;


public class PhoneLinesInfo
{
    /**
     * Internal identifier of a phone line
     */
    public String id;
    public PhoneLinesInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Type of phone line
     * Enum: Standalone, StandaloneFree, BlaPrimary, BlaSecondary
     */
    public String lineType;
    public PhoneLinesInfo lineType(String lineType)
    {
        this.lineType = lineType;
        return this;
    }

    /**
     */
    public PhoneNumberInfoIntId phoneInfo;
    public PhoneLinesInfo phoneInfo(PhoneNumberInfoIntId phoneInfo)
    {
        this.phoneInfo = phoneInfo;
        return this;
    }

    /**
     */
    public EmergencyAddress emergencyAddress;
    public PhoneLinesInfo emergencyAddress(EmergencyAddress emergencyAddress)
    {
        this.emergencyAddress = emergencyAddress;
        return this;
    }
}
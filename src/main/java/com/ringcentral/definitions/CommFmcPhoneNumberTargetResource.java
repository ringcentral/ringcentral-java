package com.ringcentral.definitions;


public class CommFmcPhoneNumberTargetResource
{
    /**
     * Required
     */
    public CommPhoneNumberResource destination;
    public CommFmcPhoneNumberTargetResource destination(CommPhoneNumberResource destination)
    {
        this.destination = destination;
        return this;
    }

    /**
     * Ring target type
     * Example: FmcPhoneNumberRingTarget
     * Enum: FmcPhoneNumberRingTarget
     */
    public String type;
    public CommFmcPhoneNumberTargetResource type(String type)
    {
        this.type = type;
        return this;
    }
}
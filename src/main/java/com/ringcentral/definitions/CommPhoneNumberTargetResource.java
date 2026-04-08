package com.ringcentral.definitions;


public class CommPhoneNumberTargetResource
{
    /**
     * Required
     */
    public CommPhoneNumberResource destination;
    public CommPhoneNumberTargetResource destination(CommPhoneNumberResource destination)
    {
        this.destination = destination;
        return this;
    }

    /**
     * Ring target type
     * Example: PhoneNumberRingTarget
     * Enum: PhoneNumberRingTarget
     */
    public String type;
    public CommPhoneNumberTargetResource type(String type)
    {
        this.type = type;
        return this;
    }
}
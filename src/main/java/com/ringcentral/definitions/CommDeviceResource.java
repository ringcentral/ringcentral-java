package com.ringcentral.definitions;


public class CommDeviceResource
{
    /**
     * Internal identifier of a device
     * Required
     * Example: 5423543
     */
    public String id;
    public CommDeviceResource id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Device name
     * Example: HP2
     */
    public String name;
    public CommDeviceResource name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format
     */
    public String phoneNumber;
    public CommDeviceResource phoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
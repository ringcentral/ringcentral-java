package com.ringcentral.definitions;


public class PartyInfo
{
    /**
     * Phone number of a party
     */
    public String phoneNumber;
    public PartyInfo phoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Displayed name of a party
     */
    public String name;
    public PartyInfo name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Internal identifier of a device
     */
    public String deviceId;
    public PartyInfo deviceId(String deviceId)
    {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * Internal identifier of an extension
     */
    public String extensionId;
    public PartyInfo extensionId(String extensionId)
    {
        this.extensionId = extensionId;
        return this;
    }
}
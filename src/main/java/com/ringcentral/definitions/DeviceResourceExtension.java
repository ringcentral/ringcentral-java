package com.ringcentral.definitions;


public class DeviceResourceExtension
{
    /**
     */
    public String id;
    public DeviceResourceExtension id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     */
    public String name;
    public DeviceResourceExtension name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     */
    public String extensionNumber;
    public DeviceResourceExtension extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }
}
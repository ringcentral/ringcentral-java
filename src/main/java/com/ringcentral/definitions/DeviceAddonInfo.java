package com.ringcentral.definitions;


public class DeviceAddonInfo
{
    /**
     */
    public String id;
    public DeviceAddonInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     */
    public String name;
    public DeviceAddonInfo name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Format: int32
     */
    public Long count;
    public DeviceAddonInfo count(Long count)
    {
        this.count = count;
        return this;
    }
}
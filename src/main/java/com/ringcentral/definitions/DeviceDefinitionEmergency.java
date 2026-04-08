package com.ringcentral.definitions;


public class DeviceDefinitionEmergency
{
    /**
     */
    public DeviceDefinitionEmergencyLocation location;
    public DeviceDefinitionEmergency location(DeviceDefinitionEmergencyLocation location)
    {
        this.location = location;
        return this;
    }

    /**
     */
    public PostalAddress address;
    public DeviceDefinitionEmergency address(PostalAddress address)
    {
        this.address = address;
        return this;
    }
}
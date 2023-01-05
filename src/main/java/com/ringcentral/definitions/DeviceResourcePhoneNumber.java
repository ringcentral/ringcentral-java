package com.ringcentral.definitions;


public class DeviceResourcePhoneNumber
{
    /**
     */
    public String id;
    public DeviceResourcePhoneNumber id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     */
    public String e164;
    public DeviceResourcePhoneNumber e164(String e164)
    {
        this.e164 = e164;
        return this;
    }

    /**
     */
    public String formatted;
    public DeviceResourcePhoneNumber formatted(String formatted)
    {
        this.formatted = formatted;
        return this;
    }
}
package com.ringcentral.definitions;


public class CallerIdDeviceInfoRequest
{
    /**
     * Internal identifier of a device
     */
    public String id;
    public CallerIdDeviceInfoRequest id(String id)
    {
        this.id = id;
        return this;
    }
}
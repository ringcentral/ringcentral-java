package com.ringcentral.definitions;


public class BulkAddDevicesItemEmergency
{
    /**
     */
    public BulkAddDevicesItemEmergencyLocation location;
    public BulkAddDevicesItemEmergency location(BulkAddDevicesItemEmergencyLocation location)
    {
        this.location = location;
        return this;
    }

    /**
     */
    public PostalAddress address;
    public BulkAddDevicesItemEmergency address(PostalAddress address)
    {
        this.address = address;
        return this;
    }
}
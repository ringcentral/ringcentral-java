package com.ringcentral.definitions;


public class BulkAddDevicesItemEmergency {
    /**
     *
     */
    public PostalAddress address;
    /**
     *
     */
    public BulkAddDevicesItemEmergencyLocation location;

    public BulkAddDevicesItemEmergency address(PostalAddress address) {
        this.address = address;
        return this;
    }

    public BulkAddDevicesItemEmergency location(BulkAddDevicesItemEmergencyLocation location) {
        this.location = location;
        return this;
    }
}

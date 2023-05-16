package com.ringcentral.definitions;


public class DeviceDefinitionEmergency {
    /**
     *
     */
    public PostalAddress address;
    /**
     *
     */
    public DeviceDefinitionEmergencyLocation location;

    public DeviceDefinitionEmergency address(PostalAddress address) {
        this.address = address;
        return this;
    }

    public DeviceDefinitionEmergency location(DeviceDefinitionEmergencyLocation location) {
        this.location = location;
        return this;
    }
}

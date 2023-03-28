package com.ringcentral.definitions;


/**
 * Query parameters for operation readDevice
 */
public class ReadDeviceParameters {
    /**
     * Specifies if an emergency address should be synchronized or not
     */
    public Boolean syncEmergencyAddress;

    public ReadDeviceParameters syncEmergencyAddress(Boolean syncEmergencyAddress) {
        this.syncEmergencyAddress = syncEmergencyAddress;
        return this;
    }
}

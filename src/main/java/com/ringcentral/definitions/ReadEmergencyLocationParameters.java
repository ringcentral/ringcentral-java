package com.ringcentral.definitions;


/**
 * Query parameters for operation readEmergencyLocation
 */
public class ReadEmergencyLocationParameters {
    /**
     * If true, the emergency addresses will be synchronized with the
     * external provider data
     */
    public Boolean syncEmergencyAddress;

    public ReadEmergencyLocationParameters syncEmergencyAddress(Boolean syncEmergencyAddress) {
        this.syncEmergencyAddress = syncEmergencyAddress;
        return this;
    }
}

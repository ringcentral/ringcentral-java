package com.ringcentral.definitions;


public class DevicePhoneLinesEmergencyAddressInfo {
    /**
     * Indicates that emergency address is required
     */
    public Boolean required;
    /**
     * Indicates that only local emergency address can be specified
     */
    public Boolean localOnly;

    public DevicePhoneLinesEmergencyAddressInfo required(Boolean required) {
        this.required = required;
        return this;
    }

    public DevicePhoneLinesEmergencyAddressInfo localOnly(Boolean localOnly) {
        this.localOnly = localOnly;
        return this;
    }
}

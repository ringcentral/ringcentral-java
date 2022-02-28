package com.ringcentral.definitions;


public class DevicePhoneLinesEmergencyAddressInfo
{
    /**
     * &#039;True&#039; if specifying of emergency address is required
     */
    public Boolean required;
    public DevicePhoneLinesEmergencyAddressInfo required(Boolean required)
    {
        this.required = required;
        return this;
    }

    /**
     * &#039;True&#039; if only local emergency address can be specified
     */
    public Boolean localOnly;
    public DevicePhoneLinesEmergencyAddressInfo localOnly(Boolean localOnly)
    {
        this.localOnly = localOnly;
        return this;
    }
}
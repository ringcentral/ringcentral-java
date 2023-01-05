package com.ringcentral.definitions;


public class UpdateSwitchInfo
{
    /**
     * Internal identifier of a switch
     */
    public String id;
    public UpdateSwitchInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of a network switch. The supported formats
    * are: XX:XX:XX:XX:XX:XX (symbols 0-9 and A-F) for MAC address and X.X.X.X
    * for IP address (symbols 0-255)
     */
    public String chassisId;
    public UpdateSwitchInfo chassisId(String chassisId)
    {
        this.chassisId = chassisId;
        return this;
    }

    /**
     * Name of a network switch
     */
    public String name;
    public UpdateSwitchInfo name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     */
    public SwitchSiteInfo site;
    public UpdateSwitchInfo site(SwitchSiteInfo site)
    {
        this.site = site;
        return this;
    }

    /**
     */
    public EmergencyAddressInfo emergencyAddress;
    public UpdateSwitchInfo emergencyAddress(EmergencyAddressInfo emergencyAddress)
    {
        this.emergencyAddress = emergencyAddress;
        return this;
    }
}
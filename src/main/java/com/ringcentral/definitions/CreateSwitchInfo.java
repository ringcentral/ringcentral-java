package com.ringcentral.definitions;


public class CreateSwitchInfo
{
    /**
     * Unique identifier of a network switch. The supported formats are: XX:XX:XX:XX:XX:XX (symbols 0-9 and A-F) for MAC address and X.X.X.X for IP address (symbols 0-255)
     * Required
     */
    public String chassisId;
    public CreateSwitchInfo chassisId(String chassisId)
    {
        this.chassisId = chassisId;
        return this;
    }

    /**
     * Name of a network switch
     */
    public String name;
    public CreateSwitchInfo name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     */
    public SwitchSiteInfo site;
    public CreateSwitchInfo site(SwitchSiteInfo site)
    {
        this.site = site;
        return this;
    }

    /**
     */
    public EmergencyAddressInfo emergencyAddress;
    public CreateSwitchInfo emergencyAddress(EmergencyAddressInfo emergencyAddress)
    {
        this.emergencyAddress = emergencyAddress;
        return this;
    }

    /**
     */
    public EmergencyLocationInfo emergencyLocation;
    public CreateSwitchInfo emergencyLocation(EmergencyLocationInfo emergencyLocation)
    {
        this.emergencyLocation = emergencyLocation;
        return this;
    }
}
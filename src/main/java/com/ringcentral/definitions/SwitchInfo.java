package com.ringcentral.definitions;


public class SwitchInfo
{
    /**
     * Link to the network switch resource
     * Format: uri
     */
    public String uri;
    public SwitchInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Internal identifier of a network switch
     */
    public String id;
    public SwitchInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of a network switch
     */
    public String chassisId;
    public SwitchInfo chassisId(String chassisId)
    {
        this.chassisId = chassisId;
        return this;
    }

    /**
     * Name of a network switch
     */
    public String name;
    public SwitchInfo name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     */
    public SwitchSiteInfo site;
    public SwitchInfo site(SwitchSiteInfo site)
    {
        this.site = site;
        return this;
    }

    /**
     */
    public EmergencyAddressInfo emergencyAddress;
    public SwitchInfo emergencyAddress(EmergencyAddressInfo emergencyAddress)
    {
        this.emergencyAddress = emergencyAddress;
        return this;
    }

    /**
     */
    public EmergencyLocationInfo emergencyLocation;
    public SwitchInfo emergencyLocation(EmergencyLocationInfo emergencyLocation)
    {
        this.emergencyLocation = emergencyLocation;
        return this;
    }
}
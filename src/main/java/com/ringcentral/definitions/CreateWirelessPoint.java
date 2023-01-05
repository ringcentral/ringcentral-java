package com.ringcentral.definitions;


public class CreateWirelessPoint
{
    /**
     * Unique 48-bit identifier of wireless access point that follows MAC address conventions.  Mask: XX:XX:XX:XX:XX:XX, where X can be a symbol in the range of 0-9 or A-F
     * Required
     */
    public String bssid;
    public CreateWirelessPoint bssid(String bssid)
    {
        this.bssid = bssid;
        return this;
    }

    /**
     * Wireless access point name
     * Required
     */
    public String name;
    public CreateWirelessPoint name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     */
    public EmergencyAddressAutoUpdateSiteInfo site;
    public CreateWirelessPoint site(EmergencyAddressAutoUpdateSiteInfo site)
    {
        this.site = site;
        return this;
    }

    /**
     */
    public EmergencyAddressInfo emergencyAddress;
    public CreateWirelessPoint emergencyAddress(EmergencyAddressInfo emergencyAddress)
    {
        this.emergencyAddress = emergencyAddress;
        return this;
    }

    /**
     */
    public EmergencyLocationInfo emergencyLocation;
    public CreateWirelessPoint emergencyLocation(EmergencyLocationInfo emergencyLocation)
    {
        this.emergencyLocation = emergencyLocation;
        return this;
    }
}
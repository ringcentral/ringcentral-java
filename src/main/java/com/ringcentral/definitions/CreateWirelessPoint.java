package com.ringcentral.definitions;


public class CreateWirelessPoint {
    /**
     * Unique 48-bit identifier of wireless access point that follows MAC address conventions.  Mask: XX:XX:XX:XX:XX:XX, where X can be a symbol in the range of 0-9 or A-F
     * Required
     */
    public String bssid;
    /**
     * Wireless access point name
     * Required
     */
    public String name;
    /**
     *
     */
    public EmergencyAddressAutoUpdateSiteInfo site;
    /**
     *
     */
    public EmergencyAddressInfoDefault emergencyAddress;
    /**
     *
     */
    public EmergencyLocationInfo emergencyLocation;

    public CreateWirelessPoint bssid(String bssid) {
        this.bssid = bssid;
        return this;
    }

    public CreateWirelessPoint name(String name) {
        this.name = name;
        return this;
    }

    public CreateWirelessPoint site(EmergencyAddressAutoUpdateSiteInfo site) {
        this.site = site;
        return this;
    }

    public CreateWirelessPoint emergencyAddress(EmergencyAddressInfoDefault emergencyAddress) {
        this.emergencyAddress = emergencyAddress;
        return this;
    }

    public CreateWirelessPoint emergencyLocation(EmergencyLocationInfo emergencyLocation) {
        this.emergencyLocation = emergencyLocation;
        return this;
    }
}

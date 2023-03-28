package com.ringcentral.definitions;


public class UpdateWirelessPoint {
    /**
     * Internal identifier of a wireless point
     */
    public String id;
    /**
     * Unique 48-bit identifier of wireless access point that follows
     * MAC address conventions. Mask: XX:XX:XX:XX:XX:XX, where X can be a symbol
     * in the range of 0-9 or A-F
     */
    public String bssid;
    /**
     * Name of a wireless access point
     */
    public String name;
    /**
     *
     */
    public EmergencyAddressAutoUpdateSiteInfo site;
    /**
     *
     */
    public EmergencyAddressInfo emergencyAddress;

    public UpdateWirelessPoint id(String id) {
        this.id = id;
        return this;
    }

    public UpdateWirelessPoint bssid(String bssid) {
        this.bssid = bssid;
        return this;
    }

    public UpdateWirelessPoint name(String name) {
        this.name = name;
        return this;
    }

    public UpdateWirelessPoint site(EmergencyAddressAutoUpdateSiteInfo site) {
        this.site = site;
        return this;
    }

    public UpdateWirelessPoint emergencyAddress(EmergencyAddressInfo emergencyAddress) {
        this.emergencyAddress = emergencyAddress;
        return this;
    }
}

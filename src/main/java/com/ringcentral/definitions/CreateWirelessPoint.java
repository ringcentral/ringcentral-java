package com.ringcentral.definitions;


public class CreateWirelessPoint {
    /**
     * Unique 48-bit identifier of wireless access point complying with MAC address conventions. The Mask is XX:XX:XX:XX:XX:XX, where X can be a symbol in the range of 0-9 or A-F
     * Required
     */
    public String bssid;
    /**
     * Wireless access point name
     * Required
     */
    public String name;
    /**
     * Site data. If multi-site feature is turned on for the account, then internal identifier of a site must be specified. To assign the wireless point to the main site (company) set site ID to `main-site`
     */
    public AutomaticLocationUpdatesSiteInfo site;
    /**
     * Emergency address information. Only one of a pair `emergencyAddress` or `emergencyLocationId` should be specified, otherwise the error is returned
     * Required
     */
    public LocationUpdatesEmergencyAddressInfo emergencyAddress;
    /**
     * Internal identifier of the emergency response location (address). Only one of a pair `emergencyAddress` or `emergencyLocationId` should be specified, otherwise the error is returned
     */
    public String emergencyLocationId;

    public CreateWirelessPoint bssid(String bssid) {
        this.bssid = bssid;
        return this;
    }

    public CreateWirelessPoint name(String name) {
        this.name = name;
        return this;
    }

    public CreateWirelessPoint site(AutomaticLocationUpdatesSiteInfo site) {
        this.site = site;
        return this;
    }

    public CreateWirelessPoint emergencyAddress(LocationUpdatesEmergencyAddressInfo emergencyAddress) {
        this.emergencyAddress = emergencyAddress;
        return this;
    }

    public CreateWirelessPoint emergencyLocationId(String emergencyLocationId) {
        this.emergencyLocationId = emergencyLocationId;
        return this;
    }

}

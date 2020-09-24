package com.ringcentral.definitions;


public class UpdateWirelessPoint {
    /**
     * Internal identifier of a wireless point
     */
    public String id;
    /**
     * Unique 48-bit identifier of wireless access point complying with MAC address conventions. Mask: XX:XX:XX:XX:XX:XX, where X can be a symbol in the range of 0-9 or A-F
     */
    public String bssid;
    /**
     * Wireless access point name
     */
    public String name;
    /**
     * Site data. If multi-site feature is turned on for the account, then internal identifier of a site must be specified. To assign the wireless point to the main site (company) set site ID to `main-site`
     */
    public AutomaticLocationUpdatesSiteInfo site;
    /**
     * Emergency address information. Only one of a pair `emergencyAddress` or `emergencyLocationId` should be specified, otherwise the error is returned
     */
    public LocationUpdatesEmergencyAddressInfoRequest emergencyAddress;
    /**
     * Deprecated. Internal identifier of the emergency response location (address). Only one of a pair `emergencyAddress` or `emergencyLocationId` should be specified, otherwise the error is returned
     */
    public String emergencyLocationId;
    /**
     * Emergency response location information
     */
    public ERLLocationInfo emergencyLocation;

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

    public UpdateWirelessPoint site(AutomaticLocationUpdatesSiteInfo site) {
        this.site = site;
        return this;
    }

    public UpdateWirelessPoint emergencyAddress(LocationUpdatesEmergencyAddressInfoRequest emergencyAddress) {
        this.emergencyAddress = emergencyAddress;
        return this;
    }

    public UpdateWirelessPoint emergencyLocationId(String emergencyLocationId) {
        this.emergencyLocationId = emergencyLocationId;
        return this;
    }

    public UpdateWirelessPoint emergencyLocation(ERLLocationInfo emergencyLocation) {
        this.emergencyLocation = emergencyLocation;
        return this;
    }

}

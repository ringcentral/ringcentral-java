package com.ringcentral.definitions;


public class WirelessPointInfoRequest {
    /**
     * Internal identifier of a wireless point
     */
    public String id;
    /**
     * Unique 48-bit identifier of the wireless access point complying with MAC address conventions
     */
    public String bssid;
    /**
     * Wireless access point name
     */
    public String name;
    /**
     * Site data (internal identifier and custom name of a site)
     */
    public AutomaticLocationUpdatesSiteInfo site;
    /**
     * Emergency address assigned to the wireless point. Only one of a pair `emergencyAddress` or `emergencyLocationId` should be specified, otherwise the error is returned
     */
    public LocationUpdatesEmergencyAddressInfoRequest emergencyAddress;
    /**
     * Emergency response location (address) internal identifier. Only one of a pair `emergencyAddress` or `emergencyLocationId` should be specified, otherwise the error is returned
     */
    public String emergencyLocationId;

    public WirelessPointInfoRequest id(String id) {
        this.id = id;
        return this;
    }

    public WirelessPointInfoRequest bssid(String bssid) {
        this.bssid = bssid;
        return this;
    }

    public WirelessPointInfoRequest name(String name) {
        this.name = name;
        return this;
    }

    public WirelessPointInfoRequest site(AutomaticLocationUpdatesSiteInfo site) {
        this.site = site;
        return this;
    }

    public WirelessPointInfoRequest emergencyAddress(LocationUpdatesEmergencyAddressInfoRequest emergencyAddress) {
        this.emergencyAddress = emergencyAddress;
        return this;
    }

    public WirelessPointInfoRequest emergencyLocationId(String emergencyLocationId) {
        this.emergencyLocationId = emergencyLocationId;
        return this;
    }

}

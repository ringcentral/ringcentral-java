package com.ringcentral.definitions;


public class WirelessPointInfo {
    /**
     * Link to the wireless point resource
     */
    public String uri;
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
     *
     */
    public AutomaticLocationUpdatesSiteInfo site;
    /**
     *
     */
    public LocationUpdatesEmergencyAddressInfo emergencyAddress;
    /**
     *
     */
    public ERLLocationInfo emergencyLocation;
    /**
     * Deprecated. Emergency response location (address) internal identifier. Only one of a pair `emergencyAddress` or `emergencyLocationId` should be specified, otherwise the error is returned
     */
    public String emergencyLocationId;

    public WirelessPointInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public WirelessPointInfo id(String id) {
        this.id = id;
        return this;
    }

    public WirelessPointInfo bssid(String bssid) {
        this.bssid = bssid;
        return this;
    }

    public WirelessPointInfo name(String name) {
        this.name = name;
        return this;
    }

    public WirelessPointInfo site(AutomaticLocationUpdatesSiteInfo site) {
        this.site = site;
        return this;
    }

    public WirelessPointInfo emergencyAddress(LocationUpdatesEmergencyAddressInfo emergencyAddress) {
        this.emergencyAddress = emergencyAddress;
        return this;
    }

    public WirelessPointInfo emergencyLocation(ERLLocationInfo emergencyLocation) {
        this.emergencyLocation = emergencyLocation;
        return this;
    }

    public WirelessPointInfo emergencyLocationId(String emergencyLocationId) {
        this.emergencyLocationId = emergencyLocationId;
        return this;
    }
}

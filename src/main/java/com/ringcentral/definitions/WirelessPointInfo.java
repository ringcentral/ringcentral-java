package com.ringcentral.definitions;


public class WirelessPointInfo {
    /**
     * Link to the wireless point resource
     * Format: uri
     */
    public String uri;
    /**
     * Internal identifier of a wireless point
     */
    public String id;
    /**
     * Unique 48-bit identifier of the wireless access point that follows MAC address conventions
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
     * Emergency address information (or information assigned to the
     * switch or wireless point - in case of using them). Only one of a pair
     * `emergencyAddress` or `emergencyLocationId` should be specified,
     * otherwise an error is returned
     * Required
     */
    public WirelessPointInfoEmergencyAddress emergencyAddress;
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

    public WirelessPointInfo site(EmergencyAddressAutoUpdateSiteInfo site) {
        this.site = site;
        return this;
    }

    public WirelessPointInfo emergencyAddress(WirelessPointInfoEmergencyAddress emergencyAddress) {
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

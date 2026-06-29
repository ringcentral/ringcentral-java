package com.ringcentral.definitions;

public class WirelessPointInfo {
    /** Link to the wireless point resource Format: uri */
    public String uri;

    public WirelessPointInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    /** Internal identifier of a wireless point */
    public String id;

    public WirelessPointInfo id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Unique 48-bit identifier of the wireless access point that follows MAC address conventions
     * Required
     */
    public String bssid;

    public WirelessPointInfo bssid(String bssid) {
        this.bssid = bssid;
        return this;
    }

    /** Wireless access point name Required */
    public String name;

    public WirelessPointInfo name(String name) {
        this.name = name;
        return this;
    }

    /** */
    public EmergencyAddressAutoUpdateSiteInfo site;

    public WirelessPointInfo site(EmergencyAddressAutoUpdateSiteInfo site) {
        this.site = site;
        return this;
    }

    /** Required */
    public EmergencyAddressInfo emergencyAddress;

    public WirelessPointInfo emergencyAddress(EmergencyAddressInfo emergencyAddress) {
        this.emergencyAddress = emergencyAddress;
        return this;
    }

    /** */
    public EmergencyLocationInfo emergencyLocation;

    public WirelessPointInfo emergencyLocation(EmergencyLocationInfo emergencyLocation) {
        this.emergencyLocation = emergencyLocation;
        return this;
    }
}

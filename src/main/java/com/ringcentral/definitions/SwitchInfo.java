package com.ringcentral.definitions;


public class SwitchInfo {
    /**
     * Link to the network switch resource
     * Format: uri
     */
    public String uri;
    /**
     * Internal identifier of a network switch
     */
    public String id;
    /**
     * Unique identifier of a network switch
     */
    public String chassisId;
    /**
     * Switch entity extension for better diversity. Should be used together with chassisId.
     */
    public String port;
    /**
     * Name of a network switch
     */
    public String name;
    /**
     *
     */
    public SwitchSiteInfo site;
    /**
     *
     */
    public EmergencyAddressInfo emergencyAddress;
    /**
     *
     */
    public EmergencyLocationInfo emergencyLocation;

    public SwitchInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public SwitchInfo id(String id) {
        this.id = id;
        return this;
    }

    public SwitchInfo chassisId(String chassisId) {
        this.chassisId = chassisId;
        return this;
    }

    public SwitchInfo port(String port) {
        this.port = port;
        return this;
    }

    public SwitchInfo name(String name) {
        this.name = name;
        return this;
    }

    public SwitchInfo site(SwitchSiteInfo site) {
        this.site = site;
        return this;
    }

    public SwitchInfo emergencyAddress(EmergencyAddressInfo emergencyAddress) {
        this.emergencyAddress = emergencyAddress;
        return this;
    }

    public SwitchInfo emergencyLocation(EmergencyLocationInfo emergencyLocation) {
        this.emergencyLocation = emergencyLocation;
        return this;
    }
}

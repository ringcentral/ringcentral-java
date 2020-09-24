package com.ringcentral.definitions;


public class SwitchInfo {
    /**
     * Link to the network switch resource
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
     * Name of a network switch
     */
    public String name;
    /**
     * Site data
     */
    public SwitchSiteInfo site;
    /**
     * Emergency address assigned to the switch. Only one of a pair `emergencyAddress` or `emergencyLocationId` should be specified, otherwise the error is returned
     */
    public LocationUpdatesEmergencyAddressInfo emergencyAddress;
    /**
     * Deprecated. Emergency response location (address) internal identifier. Only one of a pair `emergencyAddress` or `emergencyLocationId` should be specified, otherwise the error is returned
     */
    public String emergencyLocationId;
    /**
     * Emergency response location information
     */
    public ERLLocationInfo emergencyLocation;

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

    public SwitchInfo name(String name) {
        this.name = name;
        return this;
    }

    public SwitchInfo site(SwitchSiteInfo site) {
        this.site = site;
        return this;
    }

    public SwitchInfo emergencyAddress(LocationUpdatesEmergencyAddressInfo emergencyAddress) {
        this.emergencyAddress = emergencyAddress;
        return this;
    }

    public SwitchInfo emergencyLocationId(String emergencyLocationId) {
        this.emergencyLocationId = emergencyLocationId;
        return this;
    }

    public SwitchInfo emergencyLocation(ERLLocationInfo emergencyLocation) {
        this.emergencyLocation = emergencyLocation;
        return this;
    }

}

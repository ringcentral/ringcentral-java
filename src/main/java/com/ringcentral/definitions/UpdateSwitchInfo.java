package com.ringcentral.definitions;


public class UpdateSwitchInfo {
    /**
     * internal identifier of a switch
     */
    public String id;
    /**
     * Unique identifier of a network switch. The supported formats are: XX:XX:XX:XX:XX:XX (symbols 0-9 and A-F) for MAC address and X.X.X.X for IP address (symbols 0-255)
     */
    public String chassisId;
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
    public LocationUpdatesEmergencyAddressInfoRequest emergencyAddress;
    /**
     * Deprecated. Emergency response location (address) internal identifier. Only one of a pair `emergencyAddress` or `emergencyLocationId` should be specified, otherwise the error is returned
     */
    public String emergencyLocationId;
    /**
     *
     */
    public ERLLocationInfo emergencyLocation;

    public UpdateSwitchInfo id(String id) {
        this.id = id;
        return this;
    }

    public UpdateSwitchInfo chassisId(String chassisId) {
        this.chassisId = chassisId;
        return this;
    }

    public UpdateSwitchInfo name(String name) {
        this.name = name;
        return this;
    }

    public UpdateSwitchInfo site(SwitchSiteInfo site) {
        this.site = site;
        return this;
    }

    public UpdateSwitchInfo emergencyAddress(LocationUpdatesEmergencyAddressInfoRequest emergencyAddress) {
        this.emergencyAddress = emergencyAddress;
        return this;
    }

    public UpdateSwitchInfo emergencyLocationId(String emergencyLocationId) {
        this.emergencyLocationId = emergencyLocationId;
        return this;
    }

    public UpdateSwitchInfo emergencyLocation(ERLLocationInfo emergencyLocation) {
        this.emergencyLocation = emergencyLocation;
        return this;
    }
}

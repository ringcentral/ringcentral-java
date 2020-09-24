package com.ringcentral.definitions;


public class CreateSwitchInfo {
    /**
     * Unique identifier of a network switch. The supported formats are: XX:XX:XX:XX:XX:XX (symbols 0-9 and A-F) for MAC address and X.X.X.X for IP address (symbols 0-255)
     * Required
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
    public LocationUpdatesEmergencyAddressInfoRequest emergencyAddress;
    /**
     * Deprecated. Emergency response location (address) internal identifier. Only one of a pair `emergencyAddress` or `emergencyLocationId` should be specified, otherwise the error is returned
     */
    public String emergencyLocationId;
    /**
     * Emergency response location information
     */
    public ERLLocationInfo emergencyLocation;

    public CreateSwitchInfo chassisId(String chassisId) {
        this.chassisId = chassisId;
        return this;
    }

    public CreateSwitchInfo name(String name) {
        this.name = name;
        return this;
    }

    public CreateSwitchInfo site(SwitchSiteInfo site) {
        this.site = site;
        return this;
    }

    public CreateSwitchInfo emergencyAddress(LocationUpdatesEmergencyAddressInfoRequest emergencyAddress) {
        this.emergencyAddress = emergencyAddress;
        return this;
    }

    public CreateSwitchInfo emergencyLocationId(String emergencyLocationId) {
        this.emergencyLocationId = emergencyLocationId;
        return this;
    }

    public CreateSwitchInfo emergencyLocation(ERLLocationInfo emergencyLocation) {
        this.emergencyLocation = emergencyLocation;
        return this;
    }

}

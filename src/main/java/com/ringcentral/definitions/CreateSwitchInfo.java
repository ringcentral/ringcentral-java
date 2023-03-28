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

    public CreateSwitchInfo emergencyAddress(EmergencyAddressInfo emergencyAddress) {
        this.emergencyAddress = emergencyAddress;
        return this;
    }

    public CreateSwitchInfo emergencyLocation(EmergencyLocationInfo emergencyLocation) {
        this.emergencyLocation = emergencyLocation;
        return this;
    }
}

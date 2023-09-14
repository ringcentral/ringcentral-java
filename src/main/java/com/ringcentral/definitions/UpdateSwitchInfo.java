package com.ringcentral.definitions;


public class UpdateSwitchInfo {
    /**
     * Internal identifier of a switch
     */
    public String id;
    /**
     * Unique identifier of a network switch. The supported formats
     * are: XX:XX:XX:XX:XX:XX (symbols 0-9 and A-F) for MAC address and X.X.X.X
     * for IP address (symbols 0-255)
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
    public EmergencyAddressInfoDefault emergencyAddress;

    public UpdateSwitchInfo id(String id) {
        this.id = id;
        return this;
    }

    public UpdateSwitchInfo chassisId(String chassisId) {
        this.chassisId = chassisId;
        return this;
    }

    public UpdateSwitchInfo port(String port) {
        this.port = port;
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

    public UpdateSwitchInfo emergencyAddress(EmergencyAddressInfoDefault emergencyAddress) {
        this.emergencyAddress = emergencyAddress;
        return this;
    }
}

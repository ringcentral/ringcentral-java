package com.ringcentral.definitions;

public class SwitchInfo {
    /** Link to the network switch resource Format: uri */
    public String uri;

    public SwitchInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    /** Internal identifier of a network switch */
    public String id;

    public SwitchInfo id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of a network switch. The supported formats are: XX:XX:XX:XX:XX:XX (symbols
     * 0-9 and A-F) for MAC address and X.X.X.X for IP address (symbols 0-255) Required
     */
    public String chassisId;

    public SwitchInfo chassisId(String chassisId) {
        this.chassisId = chassisId;
        return this;
    }

    /** Switch entity extension for better diversity. Should be used together with chassisId */
    public String port;

    public SwitchInfo port(String port) {
        this.port = port;
        return this;
    }

    /** Name of a network switch */
    public String name;

    public SwitchInfo name(String name) {
        this.name = name;
        return this;
    }

    /** */
    public SwitchSiteInfo site;

    public SwitchInfo site(SwitchSiteInfo site) {
        this.site = site;
        return this;
    }

    /** */
    public EmergencyAddressInfo emergencyAddress;

    public SwitchInfo emergencyAddress(EmergencyAddressInfo emergencyAddress) {
        this.emergencyAddress = emergencyAddress;
        return this;
    }

    /** */
    public EmergencyLocationInfo emergencyLocation;

    public SwitchInfo emergencyLocation(EmergencyLocationInfo emergencyLocation) {
        this.emergencyLocation = emergencyLocation;
        return this;
    }
}

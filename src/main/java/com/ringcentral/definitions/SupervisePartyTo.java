package com.ringcentral.definitions;


/**
 * Information about a call party that is monitored
 */
public class SupervisePartyTo {
    /**
     * Phone number of a party
     */
    public String phoneNumber;
    /**
     * Displayed name of a party
     */
    public String name;
    /**
     * Internal identifier of a device
     */
    public String deviceId;
    /**
     * Internal identifier of an extension
     */
    public String extensionId;

    public SupervisePartyTo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public SupervisePartyTo name(String name) {
        this.name = name;
        return this;
    }

    public SupervisePartyTo deviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    public SupervisePartyTo extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }
}

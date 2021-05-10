package com.ringcentral.definitions;


// Information about a call party that monitors a call
public class SupervisePartyFrom {
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

    public SupervisePartyFrom phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public SupervisePartyFrom name(String name) {
        this.name = name;
        return this;
    }

    public SupervisePartyFrom deviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    public SupervisePartyFrom extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }
}

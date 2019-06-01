package com.ringcentral.definitions;


public class PartyInfo {
    /**
     * Phone number of a party
     */
    public String phoneNumber;
    /**
     * Internal identifier of an extension
     */
    public String extensionId;
    /**
     * Displayed name of a party
     */
    public String name;
    /**
     * Internal identifier of a device
     */
    public String deviceId;

    public PartyInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public PartyInfo extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public PartyInfo name(String name) {
        this.name = name;
        return this;
    }

    public PartyInfo deviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

}

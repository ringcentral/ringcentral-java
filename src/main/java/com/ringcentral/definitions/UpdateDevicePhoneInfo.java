package com.ringcentral.definitions;


public class UpdateDevicePhoneInfo {
    /**
     * Internal identifier of a phone number
     */
    public String id;

    public UpdateDevicePhoneInfo id(String id) {
        this.id = id;
        return this;
    }

}
